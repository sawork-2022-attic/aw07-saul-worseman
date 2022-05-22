package com.micropos.carts.service;

import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private final Cart cart = new Cart();

    @Override
    public void add(Item item) {
        cart.addItem(item);
    }

    @Override
    public Cart getCart() {
        return cart;
    }


    @Override
    public void checkout(List<Item> cart, String userID){

    }
}
