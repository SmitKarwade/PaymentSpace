package com.example.spacego.entitycart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    CartRepo cart_repo ;

    public List<Cart> getList(){
        return cart_repo.findAll();
    }

    public void addToList(Cart cart){
        Optional<Cart> item = cart_repo.findBymissionId(cart.getMissionId());

        if (item.isPresent()){
            cart_repo.deleteById(cart.getCartId());
        }
        cart_repo.save(cart);
    }

    public void removeFromList(Integer id){
        cart_repo.deleteById(id);
    }
}
