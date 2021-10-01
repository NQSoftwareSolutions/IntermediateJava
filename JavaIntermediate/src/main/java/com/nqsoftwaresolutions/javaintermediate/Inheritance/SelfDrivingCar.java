package com.nqsoftwaresolutions.javaintermediate.Inheritance;

public class SelfDrivingCar extends Car{
    /**
     * @param color of car
     * @param interior of car
     *                 Super is Car class from which this class is extending
     */
    public SelfDrivingCar(String color, String interior) {
        super(color, interior);
        System.out.println("Constructing a self driving car...Sky let 3.0...");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Self driving car is driving");
    }
}
