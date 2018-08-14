package com.yukong.chapter3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:39
 * @Description: 用户
 */

@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username", nullable = true, length = 32)
    private String username;

    /**
     * 密码
     */
    @Column(name = "password", nullable = true, length = 32)
    private String password;

    /**
     * 年龄
     */
    @Column(name = "age", nullable = true, length = 11)
    private Integer age;

    /**
     * 性别 1=男 2=女 其他=保密
     */
    @Column(name = "sex", nullable = true, length = 11)
    private Integer sex;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
