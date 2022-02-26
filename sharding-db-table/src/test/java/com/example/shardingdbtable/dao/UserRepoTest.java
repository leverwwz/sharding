package com.example.shardingdbtable.dao;

import com.example.shardingdbtable.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


@SpringBootTest
class UserRepoTest {

    @Autowired
    UserRepo userRepo;

    @Test
    void get() {
        PageRequest pageRequest = PageRequest.of(0, 20, Sort.Direction.DESC, "id");
        Page<User> page = userRepo.findAll(pageRequest);

        for (User user: page.getContent()){
            System.out.println("user :"+user.toString());
        }
    }
}