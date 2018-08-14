package com.yukong.chapter4.repository;


import com.yukong.chapter4.entity.User;

import java.util.List;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:47
 * @Description:
 */
public interface UserMapper {

    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (Long id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById (Long id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
}
