package com.amazon.products;

import com.amazon.accounts.Account;

public class Product {

    private String name;

    private ProductCategory productCategory;

    private int availableItemCount;

    private double price;

    private Account seller;

    public int getAvailableItemCount(){
        return this.availableItemCount;
    }

}
