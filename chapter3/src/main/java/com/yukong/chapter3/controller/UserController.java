package com.yukong.chapter3.controller;

import com.yukong.chapter3.entity.User;
import com.yukong.chapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:51
 * @Description: 用户控制器
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping(value = "/id/{id}")
    public String delete(@PathVariable  Long id) {
        userService.deleteById(id);
        return "删除成功";
    }

    @GetMapping(value = "/id/{id}")
    public User findById (@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping(value = "/username/{username}")
    public User findByUsername (@PathVariable String username) {
        return userService.getByUserName(username);
    }

    @GetMapping(value = "/")
    public List<User> findAll () {
        return userService.queryAll();
    }
}
