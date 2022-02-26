package com.example.shardingdbtable.controller;

import com.example.shardingdbtable.entity.User;
import com.example.shardingdbtable.form.UserForm;
import com.example.shardingdbtable.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody @Validated UserForm userForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return null;
        }
        User user = new User();

        BeanUtils.copyProperties(userForm, user);

        return userService.add(user);

    }

    @GetMapping("/list")
    public List<User> list() {

        return userService.getUserList();
    }

}
