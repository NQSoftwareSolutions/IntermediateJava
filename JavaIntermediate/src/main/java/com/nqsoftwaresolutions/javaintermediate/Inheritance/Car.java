package com.nqsoftwaresolutions.javaintermediate.Inheritance;

public class Car {
    private String mColor;
    private String mInterior;

    /**
     * @param color of the car
     * @param interior of the car
     *                 During this object iam providing the color & interior of new car
     */
    public Car(String color, String interior) {
        mColor = color;
        mInterior = interior;
    }

    /**
     * Now providing any input
     */
    public Car() {
    }

    /**
     * Just simple methods for calling on object
     */
    public void drive(){
        System.out.println("Card is driving");
        System.out.println("Car interior Color is "+getColor()+" "+getInterior());
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getInterior() {
        return mInterior;
    }

    public void setInterior(String interior) {
        mInterior = interior;
    }
}
