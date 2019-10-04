package com.SpringifyMongo.controller;

import com.SpringifyMongo.model.User;
import com.SpringifyMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public  String  helloWorld() {
        return "Hello World";
    }

    @GetMapping("/list")
    public List<User> listUsers() {
        return userService.listUsers();
    }
    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser)  {
        return userService.createUser(newUser);
    }
    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }
}
