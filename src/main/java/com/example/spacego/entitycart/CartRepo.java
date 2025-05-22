package com.example.spacego.entitycart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

    Optional<Cart> findBymissionId(Integer id);
}
