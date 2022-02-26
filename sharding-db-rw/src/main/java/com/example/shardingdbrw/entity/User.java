package com.example.shardingdbrw.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

}
