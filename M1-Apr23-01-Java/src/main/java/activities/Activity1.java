package activities;

public class Activity1 {

    public static void main(String[] args) {

        Car alto = new Car();

        alto.make = 2014;
        alto.color= "red";
        alto.transmission = "manual";

        alto.displayCharacteristics();
        alto.accelarate();
        alto.brake();

    }
}
