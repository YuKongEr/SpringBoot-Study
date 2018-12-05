package com.yukong.mail.entity;

import java.io.Serializable;
import java.util.Map;

/**
 * @author: yukong
 * @date: 2018/12/5 17:25
 */
public class Mail implements Serializable {
    private static final long serialVersionUID = 1L;
    //接收方邮件
    private String email;

    //主题
    private String subject;
    //模板
    private String template;

    // 自定义参数
    private Map<String, Object> params;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
