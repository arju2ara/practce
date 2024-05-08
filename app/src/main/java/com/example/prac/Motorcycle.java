package com.example.prac;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super(2);
    }

    @Override
    public void drive() {
        if (fuel >= 0.5) {
            mileage += 1.5;
            fuel -= 0.5;
        }
    }
}
