package com.example.spacego.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    public List<UserDetails> getUsers(){
        return repo.findAll();
    }

    public void saveUser(UserDetails user) {
        repo.save(user);
    }

}
