package com.open.user.web.controller;

import com.open.user.domain.User;
import com.open.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * 〈〉
 *
 * @Package com.open.user.web.controller
 * @ClassName UserServiceProviderTestApiController
 * @Author wangky
 * @Create 2018/4/14 22:40
 */
@RestController
public class UserServiceProviderTestApiController {
    @Autowired
    private UserService userService;
    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user){

        if(userService.save(user)){
            return user;
        }else{
            return null;
        }
    }
    @GetMapping("/user/list")
    public Collection<User> list(){
        return userService.findAll();
    }
}