package com.example.shardingdbrw.service.impl;

import com.example.shardingdbrw.dao.UserRepo;
import com.example.shardingdbrw.entity.User;
import com.example.shardingdbrw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public User getOneById(Long id) {
        Optional<User> o=userRepo.findById(id);
        if (o.isPresent()){
            return o.get();
        }
        return null;
    }

    @Override
    public User add(User user) {
        return userRepo.save(user);
    }
}
