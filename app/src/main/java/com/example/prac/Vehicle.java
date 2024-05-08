package com.example.prac;

public  abstract class Vehicle {
    protected int wheels;
    protected double fuel = 0;
    protected double mileage = 0;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMileage() {
        return mileage;
    }

    public void addFuel(double liters) {
        fuel += liters;
    }

    public abstract void drive();

}
