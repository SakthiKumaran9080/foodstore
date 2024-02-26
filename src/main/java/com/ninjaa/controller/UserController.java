package com.ninjaa.controller;

import com.ninjaa.model.User;
import com.ninjaa.repository.UserRepository;
import com.ninjaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/api/users/profile")
    public User findUserByJwt(@RequestHeader("Authorization")String jwt) throws Exception{
        User user=userService.findUserByJwt(jwt);
        return user;
    }

}
