package com.nqsoftwaresolutions.javaintermediate;

public class Car {
    private String mModel;
    private int mEngineHp;
    private static String mColor;
    private int mSpeed;
    private boolean mAccelerator;
    private boolean mBrake;
    private int mGear;
    private boolean mAutomatic;
    private int mSeats;

    public Car(String chooseColor) {
        mColor = chooseColor;
    }

    public Car() {
    }

    /**
     * Todo This is constructor
     * & it will call every time when we create any
     *      object of that class
     * @param model of car
     * @param engineHp of engine
     * @param color of car
     * @param speed of car
     * @param accelerator in car or not
     * @param brake in car or not
     * @param gear how many in car
     * @param automatic yes or not
     * @param seats how many in car
     */
    public Car(String model, int engineHp, String color
            , int speed, boolean accelerator, boolean brake
            , int gear, boolean automatic, int seats) {
        mModel = model;
        mEngineHp = engineHp;
        mColor = color;
        mSpeed = speed;
        mAccelerator = accelerator;
        mBrake = brake;
        mGear = gear;
        mAutomatic = automatic;
        mSeats = seats;
    }

    /**Todo this method will return normal speed
     * @return normal speed of car
     */
    public int drive(){
        System.out.println("Car is moving...");
        return mSpeed/2;
    }

    /**
     * @return model of car
     */
    public String getModel() {
        return mModel;
    }

    /**
     * @param model set the model of car
     */
    public void setModel(String model) {
        mModel = model;
    }

    /**
     * @return hp of engine
     */
    public int getEngineHp() {
        return mEngineHp;
    }

    /**
     * @param engineHp set the hp of engine
     */
    public void setEngineHp(int engineHp) {
        mEngineHp = engineHp;
    }

    /**
     * @return get the color of engine
     */
    public String getColor() {
        return mColor;
    }

    /**
     * @param color set the color of car
     */
    public void setColor(String color) {
        mColor = color;
    }

    /**
     * @return speed of car
     */
    public int getSpeed() {
        return mSpeed;
    }

    /**
     * @param speed set the speed of the car
     */
    public void setSpeed(int speed) {
        mSpeed = speed;
    }

    /**
     * @return accelerator is available of not
     */
    public boolean isAccelerator() {
        return mAccelerator;
    }

    /**
     * @param accelerator set the accelerator
     */
    public void setAccelerator(boolean accelerator) {
        mAccelerator = accelerator;
    }

    /**
     * @return break is available of not
     */
    public boolean isBrake() {
        return mBrake;
    }

    /**
     * @param brake set the break of car
     */
    public void setBrake(boolean brake) {
        mBrake = brake;
    }

    /**
     * @return how many gears are available is the car
     */
    public int getGear() {
        return mGear;
    }

    /**
     * @param gear set the gears of the car
     */
    public void setGear(int gear) {
        mGear = gear;
    }

    /**
     * @return car ir automatic of not
     */
    public boolean isAutomatic() {
        return mAutomatic;
    }

    /**
     * @param automatic set the automation of car
     */
    public void setAutomatic(boolean automatic) {
        mAutomatic = automatic;
    }

    /**
     * @return how many seats are available in the class
     */
    public int getSeats() {
        return mSeats;
    }

    /**
     * @param seats set the seats of car
     */
    public void setSeats(int seats) {
        mSeats = seats;
    }
}
