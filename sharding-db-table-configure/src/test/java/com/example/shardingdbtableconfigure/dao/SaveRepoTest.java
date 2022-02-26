package com.example.shardingdbtableconfigure.dao;

import com.example.shardingdbtableconfigure.entity.Save;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SaveRepoTest {

    @Autowired
    SaveRepo saveRepo;

    @Test
    void get() {
        PageRequest pageRequest = PageRequest.of(0, 2, Sort.Direction.DESC, "id");
        Page<Save> page = saveRepo.findAll(pageRequest);
        for (Save s : page.getContent()) {
            System.out.println("---------------- save--------" + s.toString());
        }
    }
}