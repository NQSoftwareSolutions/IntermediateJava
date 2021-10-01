package com.nqsoftwaresolutions.javaintermediate.Inheritance;

public class CarSimulation {
    public static void main(String[] args) {
        System.out.println("Launching car simulation....");

        Car myToyota = new Car("Blue", "Wood");
        Car myHonda = new Car();

        myToyota.drive();

        SelfDrivingCar myAutoBoot  = new SelfDrivingCar("Yellow", "Plastic");
        myAutoBoot.drive();

    }
}
