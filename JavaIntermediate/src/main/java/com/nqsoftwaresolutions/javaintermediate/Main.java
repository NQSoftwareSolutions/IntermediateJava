package com.nqsoftwaresolutions.javaintermediate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car simulator is launching....");
        // Todo Create object of car class
        Car myCar = new Car("Benz",2400,
                "Silver", 360,
                true, true,
                6, true,4);

        System.out.println(
                "My Car model is "+myCar.getModel()+
                        " , has "+myCar.getEngineHp()+" horse power engine "+
                        ", Color is "+myCar.getColor()+
                        " , it comes with high speed of "+myCar.getSpeed()+
                        " , It has accelerator ("+myCar.isAccelerator()+")"+
                        " , it has break ("+myCar.isBrake()+")"+
                        " ,it has "+myCar.getGear()+" gears"+
                        " , it is automatic ("+myCar.isAutomatic()+")"+
                        " & it has "+myCar.getSeats()+" number of seats."
        );

        myCar.drive();

        //Todo use of static variables
        Car honda = new Car("Blue");
        Car toyota = new Car();

        //Now these both have same color
        System.out.println("Honda color is "+honda.getColor());
        System.out.println("Toyota color is "+toyota.getColor());

    }
}