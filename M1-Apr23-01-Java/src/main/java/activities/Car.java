package activities;

import java.sql.SQLOutput;

public class Car {
    String color,transmission;
    int make,tyres,doors;

    //Constructor
    Car(){
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("Color :" + color);
        System.out.println("transmission :" + transmission);
        System.out.println("make :" + make);
        System.out.println("doors :" + doors);
        System.out.println("tyres :" + tyres);

    }

    public void accelarate(){
        System.out.println("car is moving forward");
    }

    public void brake(){
        System.out.println("car has stopped");
    }
}
