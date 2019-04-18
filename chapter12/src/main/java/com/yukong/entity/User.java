package com.yukong.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 *
 * @author yukong
 * @date 2019-04-11 16:50
 */
public class User implements UserDetails {
    /**
    * 主键
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 用户号码
    */
    private String svcNum;

    /**
    * 密码
    */
    private String password;

    /**
    * 客户id  1对1
    */
    private Long custId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSvcNum() {
        return svcNum;
    }

    public void setSvcNum(String svcNum) {
        this.svcNum = svcNum;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 这里我们没有用到权限，所以返回一个默认的admin权限
        return AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}