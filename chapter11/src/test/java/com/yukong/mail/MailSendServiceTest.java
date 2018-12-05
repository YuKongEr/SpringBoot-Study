package com.yukong.mail;

import com.yukong.mail.entity.Mail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author: yukong
 * @date: 2018/12/5 17:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MailSendServiceTest {


    @Autowired
    private MailSendService mailSendService;

    @Test
    public void sendWithHTMLTemplate() {
        Map<String, Object> params = new HashMap<>();
        // 参数
        Integer code = (int)(Math.random()*9+1)*100000;
        params.put("code", code);
        Mail mail  = new Mail();
        mail.setEmail("yukonga@vip.qq.com");
        mail.setParams(params);
        mail.setTemplate(MailTemplateNameEnum.LOGIN_CODE.getCode());
        mail.setSubject("登录验证码");
        mailSendService.sendWithHTMLTemplate(mail);
    }
}