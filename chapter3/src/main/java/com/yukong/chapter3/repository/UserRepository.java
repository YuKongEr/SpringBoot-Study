package com.yukong.chapter3.repository;

import com.yukong.chapter3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:47
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据用户名查找用户信息
     * @param username
     * @return
     */
    User findUserByUsername(String username);

}
