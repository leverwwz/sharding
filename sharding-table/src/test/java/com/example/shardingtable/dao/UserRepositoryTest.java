package com.example.shardingtable.dao;

import com.example.shardingtable.entity.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.UUID;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void insert() {

        for (int i = 0; i < 100; i++) {
            TUser user = new TUser();
            user.setPassword(String.valueOf(i));
            user.setCertNo(UUID.randomUUID().toString());
            user.setName("sharding" + i);
            userRepository.save(user);
        }
    }

    @Test
    void getUser() {

        //query two tables and merge the result together
        PageRequest pr=PageRequest.of(0,5, Sort.Direction.ASC,"id");

        Page<TUser> p = userRepository.findAll(pr);
        System.out.println("all ======================"+p.getContent());

        List<TUser> users = userRepository.findAll();
        System.out.println("====================" + users.size());

        TUser user = userRepository.findByCertNo("089d5f5f-973f-4b15-aa21-09c2636b31f9");
        System.out.println("-------------------" + user.getId());

        PageRequest pageRequest=PageRequest.of(0,1);
        Page<TUser> l =userRepository.find(40L,pageRequest);
        System.out.println("=============="+l.getContent());
    }

}