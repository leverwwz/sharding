package com.example.shardingdbtableconfigure.service;

import com.example.shardingdbtableconfigure.entity.Save;

import java.util.List;

public interface SaveService {
    void deleteAll();

    List<Save> findAllByIdIn(List<Long> ids);

    List<Save> findAll();

    List<Save> findAllByIdBetween(Long from, Long to);

    Save save(Save save);


}
