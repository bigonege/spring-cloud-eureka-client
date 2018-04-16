package com.open.user.web.controller;

import com.open.user.domain.User;
import com.open.user.service.UserService;
import com.open.user.web.UserServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * 〈〉
 *
 * @Package com.open.user.web.controller
 * @ClassName UserController
 * @Author wangky
 * @Create 2018/4/14 22:24
 */
@RestController
public class UserRestApiController {
    @Autowired
    private UserServiceProxy userService;
    @PostMapping("/user/save")
    public User saveUser(@RequestParam String name){
        User user = new User();
        user.setName(name);
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