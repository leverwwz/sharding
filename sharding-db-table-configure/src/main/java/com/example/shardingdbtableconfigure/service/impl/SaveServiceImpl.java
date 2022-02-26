package com.example.shardingdbtableconfigure.service.impl;

import com.example.shardingdbtableconfigure.dao.SaveRepo;
import com.example.shardingdbtableconfigure.entity.Save;
import com.example.shardingdbtableconfigure.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveServiceImpl implements SaveService {
    @Autowired
    SaveRepo saveRepo;

    @Override
    public void deleteAll() {
        saveRepo.deleteAll();
    }

    @Override
    public List<Save> findAllByIdIn(List<Long> ids) {
        return saveRepo.findAllById(ids);
    }

    @Override
    public List<Save> findAll() {
        return saveRepo.findAll();
    }

    @Override
    public List<Save> findAllByIdBetween(Long from, Long to) {
        return saveRepo.findAllByIdBetween(from, to);
    }

    @Override
    public Save save(Save save) {
        return saveRepo.save(save);
    }
}
