import java.net.StandardSocketOptions;

public class Activity3 {
    public static void main(String[] args) {

        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupitorSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("age at Mercury " + seconds/EarthSeconds/MercurySeconds);
        System.out.println("age at Venus " + seconds/EarthSeconds/VenusSeconds);
        System.out.println("age at Earth " + seconds/EarthSeconds);
        System.out.println("age at Mars " + seconds/EarthSeconds/MarsSeconds);
        System.out.println("age at Jupitor " + seconds/EarthSeconds/JupitorSeconds);
        System.out.println("age at Saturn " + seconds/EarthSeconds/SaturnSeconds);
        System.out.println("age at uranus " + seconds/EarthSeconds/UranusSeconds);
        System.out.println("age at Neptune " + seconds/EarthSeconds/NeptuneSeconds);




    }


}

