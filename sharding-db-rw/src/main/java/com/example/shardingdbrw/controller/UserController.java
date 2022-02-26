package com.example.shardingdbrw.controller;

import com.example.shardingdbrw.entity.User;
import com.example.shardingdbrw.form.UserForm;
import com.example.shardingdbrw.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getOne")
    public User getOne(@RequestParam(value = "id") Long id) {

        return userService.getOneById(id);
    }

    @PostMapping("/addOne")
    public User addOne(@RequestBody @Validated UserForm userForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return null;
        }

        User user = new User();
        BeanUtils.copyProperties(userForm, user);
        return userService.add(user);
    }

}
