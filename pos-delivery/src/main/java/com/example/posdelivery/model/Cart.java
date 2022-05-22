package com.example.posdelivery.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Cart implements Serializable {

    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems(){return items;};

    public boolean addItem(Item item) {
        return items.add(item);
    }

}