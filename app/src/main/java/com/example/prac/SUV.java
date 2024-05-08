package com.example.prac;

public class SUV extends Vehicle {
    public SUV() {
        super(4);
    }

    @Override
    public void drive() {
        if (fuel >= 2.5) {
            mileage += 4;
            fuel -= 2.5;
        }
    }
}
