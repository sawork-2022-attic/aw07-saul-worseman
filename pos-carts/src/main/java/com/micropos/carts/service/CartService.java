package com.micropos.carts.service;

import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Item;

import java.util.List;

public interface CartService {
    public void add(Item item);

    public Cart getCart();

    public void checkout(List<Item> cart, String userID);

}
