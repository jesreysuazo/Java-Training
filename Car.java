package com.example.M2_Activity3;

public class Car {
    // assign attribute
    String transmission = "Manual";

    // parameterized constructor
    public Car (String transmission){
        this.transmission = transmission;
    }

    // no args constructor
    public Car () {};

    // getters and setters
    public void setTransmission(String name){this.transmission = name;};
    public String getTransmission() { return transmission; };

    // car method
    public void accelerate(){
        if(transmission.equalsIgnoreCase("Manual")){
            System.out.println("Shifter is set to 1st gear");
        } else if (transmission.equalsIgnoreCase("Automatic")) {
            System.out.println("Shifter is set to Drive");
        } else {
            System.out.println("Unknown transmission. Please pick between Manual or Automatic for now");
        }

     } // end of method

}
