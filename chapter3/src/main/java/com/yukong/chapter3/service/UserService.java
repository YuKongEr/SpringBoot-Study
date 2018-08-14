package com.yukong.chapter3.service;

import com.yukong.chapter3.entity.User;

import java.util.List;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:43
 * @Description: 用户业务接口
 */
public interface UserService {

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    User saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    User updateUser(User user);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getById(Long id);

    /**
     * 根据名称获取用户
     * @param username
     * @return
     */
    User getByUserName(String username);

    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();

    /**
     * 根据id删除用户信息
     * @param id
     */
    void deleteById(Long id);
}
