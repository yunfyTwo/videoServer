package com.example.video.service;

import com.example.video.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getAllUserByName(String name);
    User loginPage(String name,String id);
}
