package com.example.video.service.impl;

import com.example.video.entity.User;
import com.example.video.mapper.UserMapper;
import com.example.video.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getAllUserByName(String name) {
        return userMapper.getAllUserByName(name);
    }

    @Override
    public User loginPage(String name, String id) {
        return userMapper.loginPage(name,id);
    }
}
