package com.skypro.service;

import com.skypro.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addToCart (List<Integer> ids){
        this.cartRepository.addToCart(ids);
    }

    public List<Integer> getCartContent () {
        return this.cartRepository.getCartContent ();
    }
}
