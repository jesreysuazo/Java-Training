package com.example.M2_Activity3;

public class Activity3 {
    public static void main (String args[]){

        // instantiate 2 cars
        Car car1 = new Car();
        Car car2 = new Car("Automatic");

        // assign values to attribute
        car1.setTransmission("Manual");

        // call car method
        car1.accelerate();
        car2.accelerate();
    }

}
