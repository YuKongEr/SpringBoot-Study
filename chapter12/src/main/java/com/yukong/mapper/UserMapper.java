package com.yukong.mapper;

import com.yukong.entity.User;

/**
 *
 * @author yukong
 * @date 2019-04-11 16:50
 */
public interface UserMapper {

    int insertSelective(User record);

    User selectByUsername(String  username);


}