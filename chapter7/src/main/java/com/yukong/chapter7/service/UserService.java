package com.yukong.chapter7.service;

import com.yukong.chapter7.entity.User;

/**
 * @author yukong
 * @date 2018/8/20 14:34
 * @description user业务层接口
 */
public interface UserService {

    /**
     * 新增用户
     * @param user 用户信息
     * @return
     */
    User saveUser(User user);

    /**
     * 根据id删除用户
     * @param id 主键id
     * @return
     */
    Boolean removeUser(Long id);

    /**
     * 通过id查询用户
     * @param id 主键id
     * @return
     */
    User getById(Long id);

    /**
     * 根据主键id更新用户信息
     * @param user 用户信息
     * @return
     */
    User updateUser(User user);

}
