package com.example.shardingdbtableconfigure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "save")
@Data
public class Save {

    @Id
    private Long id;

    private String applyno;

    private String username;

    private String usernumber;

    private String address;

    private Long type;

    private String count;

}
