package com.example.arunava.canteen1;

public class DataModel {

    String item,quantity;

    public DataModel(String item, String quantity) {
        this.item=item;
        this.quantity=quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}