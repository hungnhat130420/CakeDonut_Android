package com.example.donutcake;

public class Cake {
    private int img;
    private String title;
    private String description;
    private String price;

    public Cake(int img, String title, String description, String price) {
        this.img = img;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Cake() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
