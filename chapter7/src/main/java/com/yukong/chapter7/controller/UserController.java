package com.yukong.chapter7.controller;

import com.yukong.chapter7.entity.User;
import com.yukong.chapter7.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yukong
 * @date 2018/8/20 15:27
 * @description user控制器
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/id/{id}")
    public Boolean delete(@PathVariable  Long id) {
        return userService.removeUser(id);
    }

    @GetMapping(value = "/id/{id}")
    public User findById (@PathVariable Long id) {
        return userService.getById(id);
    }

}
