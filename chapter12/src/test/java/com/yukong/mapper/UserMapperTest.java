package com.yukong.mapper;

import com.yukong.SpringbootSpringsecurityApplicationTests;
import com.yukong.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.Assert.*;

/**
 * @author yukong
 * @date 2019-04-11 16:53
 */

public class UserMapperTest extends SpringbootSpringsecurityApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;


    @Test
    public void insert() {
        User user = new User();
        user.setUsername("yukong");
        user.setPassword(passwordEncoder.encode("abc123"));
        userMapper.insertSelective(user);
    }


}