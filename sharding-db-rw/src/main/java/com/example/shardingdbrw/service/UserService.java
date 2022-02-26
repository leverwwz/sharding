package com.example.shardingdbrw.service;

import com.example.shardingdbrw.entity.User;

public interface UserService {
    User getOneById(Long id);

    User add(User user);
}
