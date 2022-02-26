package com.example.shardingdbtable.service.impl;

import com.example.shardingdbtable.dao.UserRepo;
import com.example.shardingdbtable.entity.User;
import com.example.shardingdbtable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Override
    public User add(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getUserList() {
        return repo.findAll();
    }
}
