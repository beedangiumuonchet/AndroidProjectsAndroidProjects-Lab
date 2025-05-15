package com.example.nguyen_thi_my_duyen_n21dccn115;

public class Food {
    private String name;
    private int calories, carbs, fat, protein;
    private int imageResId;

    public Food(String name, int calories, int carbs, int fat, int protein, int imageResId) {
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }

    public int getImageResId() {
        return imageResId;
    }
}
