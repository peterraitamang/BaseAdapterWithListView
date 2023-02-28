package com.example.baseadapterwithlistview.Model;

import java.util.ArrayList;

public class Item {
    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public static ArrayList<Item> getItems(){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Jack","Lalitpur"));
        items.add(new Item("Alex","Kathmandu"));
        items.add(new Item("Sonny","Bharatpur"));
        items.add(new Item("Carter","Bhaktapur"));
        items.add(new Item("Harry","Kirtipur"));
        items.add(new Item("Michael","Itahari"));
        items.add(new Item("Buston","Accham"));
        items.add(new Item("Joel","Biratnagar"));
        items.add(new Item("Peter","Ilam"));
        items.add(new Item("Denish","Panchthar"));
        return items;
    }
}
