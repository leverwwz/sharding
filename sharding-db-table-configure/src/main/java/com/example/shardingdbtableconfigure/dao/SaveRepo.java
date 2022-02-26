package com.example.shardingdbtableconfigure.dao;

import com.example.shardingdbtableconfigure.entity.Save;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaveRepo extends JpaRepository<Save, Long> {
    List<Save> findAllByIdBetween(Long id1, Long id2);
}
