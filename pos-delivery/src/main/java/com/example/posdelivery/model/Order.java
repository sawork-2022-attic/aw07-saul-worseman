package com.example.posdelivery.model;

import lombok.Data;

@Data
public class Order {
    private Cart cart;
    private String orderId;
    private String deliveryState;
    private String deliveryID;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}