package com.yukong.chapter3.service.impl;

import com.yukong.chapter3.entity.User;
import com.yukong.chapter3.repository.UserRepository;
import com.yukong.chapter3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 19:49
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public List<User> queryAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
