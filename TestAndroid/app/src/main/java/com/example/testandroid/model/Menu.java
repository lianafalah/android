package com.example.testandroid.model;

public class Menu {
    private int id;
    private String nama, imageUrl;


    public Menu(int id, String nama, String imageUrl) {
        this.id = id;
        this.nama = nama;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
