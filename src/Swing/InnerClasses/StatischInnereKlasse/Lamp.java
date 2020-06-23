package Swing.InnerClasses.StatischInnereKlasse;


public class Lamp {
    private static String status = "Shine";
    private int bright = 1;

    public static class Bulb {
        void output() {
            System.out.println(status);
            // nicht möglich
            // System.out.println("Brightness: "+bright);

        }

    }

}
