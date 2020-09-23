package com.example.customadaper;

public class Item {
    private String title;
    private String description;

    public Item(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    private int image;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}