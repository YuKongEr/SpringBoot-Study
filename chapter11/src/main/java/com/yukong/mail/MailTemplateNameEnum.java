package com.yukong.mail;

/**
 * @author: yukong
 * @date: 2018/12/5 17:23
 */
public enum MailTemplateNameEnum {

    LOGIN_CODE("login_code.ftl", "登录验证码模板");

    String code;

    String desc;

   private MailTemplateNameEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
