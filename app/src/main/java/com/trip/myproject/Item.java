package com.trip.myproject;

public class Item {
    private String text;
    private int imageResourceId;

    private String about;

    public Item(String text, int imageResourceId, String about) {
        this.text = text;
        this.imageResourceId = imageResourceId;
        this.about = about;
    }

    public String getText() {
        return text;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getAbout() {
        return about;
    }
}
