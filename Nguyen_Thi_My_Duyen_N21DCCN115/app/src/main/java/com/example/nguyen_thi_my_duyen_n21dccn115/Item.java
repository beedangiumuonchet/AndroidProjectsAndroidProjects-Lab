package com.example.nguyen_thi_my_duyen_n21dccn115;
public class Item {
    private String name;
    private String description; // Thêm mô tả
    private double price;
    private int imageResId;

    public Item(String name, String description, double price, int imageResId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResId() {
        return imageResId;
    }
}