package com.example.spacego.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserDetails, String> {

    UserDetails findByEmail(String email);
}
