package com.example.M2_Activity6;

public class Truck extends Vehicle implements Refuelable{

    public Truck(int numberOfWheels, String brand){
        super(numberOfWheels, brand);
    }

    @Override
    public void refuel() {
        System.out.println("Refueled 135 liters of fuel");
    }

    @Override
    public void startEngine() {
        System.out.println("BROOM BROOM");
    }
}
