package com.example.prac;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("The color of the vehicle is: " + name);
    }
}
