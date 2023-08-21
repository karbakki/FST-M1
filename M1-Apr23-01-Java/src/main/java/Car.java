public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    public Car(){
        this.tyres =4;
        this.doors = 4;
    }
    public void displayCharacteristics(){
        System.out.println("Display color:"+ color);
        System.out.println("Display tramsmission:"+ transmission);
        System.out.println("Display make:"+ make);
        System.out.println("Display tyres:"+ tyres);
        System.out.println("Display doors:"+ doors);

    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
}