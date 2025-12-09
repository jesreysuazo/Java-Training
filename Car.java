package com.example.M2_Activity6;

public class Car extends Vehicle implements Refuelable{

    public Car(int numberOfWheels, String brand){
        super(numberOfWheels, brand);
    }

    @Override
    public void refuel() {
        System.out.println("Refueled 65 liters of fuel");
    }

    @Override
    public void startEngine() {
        System.out.println("Vroom");
    }
}
