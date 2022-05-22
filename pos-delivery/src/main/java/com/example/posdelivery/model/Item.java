package com.example.posdelivery.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {
    private String productId;
    private int quantity;

    public Item(String product, int quantity) {
        this.productId = product;
        this.quantity = quantity;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}