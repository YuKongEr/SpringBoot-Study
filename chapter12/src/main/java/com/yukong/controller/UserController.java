package com.yukong.controller;

import com.yukong.entity.User;
import com.yukong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yukong
 * @date 2019-04-11 15:22
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/{username}")
    public User hello(@PathVariable String username) {
        return userMapper.selectByUsername(username);
    }

}
