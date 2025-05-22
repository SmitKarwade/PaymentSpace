package com.example.spacego.entitycart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/list")
    public List<Cart> getCartMission(){
        return cartService.getList();
    }

    @PostMapping("/addMission")
    public void addToCart(@RequestBody Cart cart){
        cartService.addToList(cart);
    }

    @DeleteMapping("/removeMission")
    public ResponseEntity<String> removeFromCart(@RequestParam Integer id){
        if (id != null && id > 0){
            cartService.removeFromList(id);
            return ResponseEntity.ok("Item deleted successfully");
        }else {
            return ResponseEntity.ok("Cannot delete the item");
        }
    }
}
