package com.yukong.mail;

import com.yukong.mail.entity.Mail;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yukong
 * @date: 2018/12/5 16:56
 */
@Service
public class MailSendService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Value("${spring.mail.username}")
    private  String USERNAME = "yukong";




    /**
     * 根据模板名 获取邮件内容
     * @param templateName
     * @param params
     * @return
     */
    private String getMailTextByTemplateName(String templateName, Map<String,Object> params) throws IOException, TemplateException {
        String mailText = "";
        //通过指定模板名获取FreeMarker模板实例
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateName);
        //FreeMarker通过Map传递动态数据
        //注意动态数据的key和模板标签中指定的属性相匹配
        //解析模板并替换动态数据，最终code将替换模板文件中的${code}标签。
        mailText = FreeMarkerTemplateUtils.processTemplateIntoString(template, params);
        return mailText;
    }

    public boolean sendWithHTMLTemplate(Mail mail) {
        try {
            //发件人的昵称
            String nick = MimeUtility.encodeText(USERNAME);
            //发件人是谁
            InternetAddress from = new InternetAddress(nick + "<541130126@qq.com>");
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setTo(mail.getEmail());
            mimeMessageHelper.setFrom(from);
            mimeMessageHelper.setSubject(mail.getSubject());
            HashMap<String, Object> params = new HashMap<>();
            // 使用模板生成html邮件内容
            String result =getMailTextByTemplateName(mail.getTemplate(), mail.getParams());
            mimeMessageHelper.setText(result, true);
            javaMailSender.send(mimeMessage);
            return true;
        } catch (Exception e) {
            logger.error("发送邮件失败" + e.getMessage());
            return false;
        }
    }


}
