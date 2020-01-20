package com.amazon.carts;

import com.amazon.products.Item;

import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public boolean addItem(Item item){
        items.add(item);
        return true;
    }

    public boolean removeItem(Item item){
        if (items.contains(item)){
            items.remove(item);
            return true;
        }else {
            return false;
        }
    }

    public List<Item> getItems(){
        return this.items;
    }
}
