package com.example.shardingdbrw.form;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserForm {

    @NonNull
    private String name;
    @NonNull
    private Integer age;
}
