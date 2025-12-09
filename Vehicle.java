package com.example.M2_Activity6;

public abstract class Vehicle {
    private int numberOfWheels;
    private String brand;

    public Vehicle(int numberOfWheels, String brand){
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public abstract void startEngine();

    public void destroy(){
        System.out.println("boom");
    }
}
