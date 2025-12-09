package com.example.M2_Activity6;

public class Application {

    public static void main(String[] args) {

        Car Car1 = new Car(4, "Toyota");
        Truck Truck1 = new Truck(16, "Optimus");

        Car1.startEngine();
        Truck1.startEngine();

        Car1.refuel();
        Truck1.refuel();

        onDestroy(Truck1);

    }

    // destroy vehicle
    static void onDestroy(Vehicle vehicle){
        vehicle.destroy();
    }


}
