package com.example.shardingdbrw.impl;

import com.example.shardingdbrw.entity.User;
import com.example.shardingdbrw.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    void add(){
        User user=new User();
        user.setAge(100);
        user.setName("name");
        userService.add(user);
    }

}