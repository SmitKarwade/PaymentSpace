package com.example.spacego.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/form")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/get")
    private List<UserDetails> getAllUsers(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    private void addUser(@RequestBody UserDetails user){
        userService.saveUser(user);
    }
}
