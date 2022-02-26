package com.example.shardingdbtable.service;

import com.example.shardingdbtable.entity.User;

import java.util.List;

public interface UserService {

    public User add(User user);

    public List<User> getUserList();
}
