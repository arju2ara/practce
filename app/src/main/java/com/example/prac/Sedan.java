package com.example.prac;

public class Sedan extends Vehicle{
    public Sedan() {
        super(4);
    }

    @Override
    public void drive() {
        if (fuel >= 2) {
            mileage += 5;
            fuel -= 2;
        }
    }
}
