package Swing.InnerClasses.NichtStatischeInnereKlasse;

public class Lamp {
    private static String status = "Shine";
    private int bright = 1;

    public class Bulb {
        void output() {
            System.out.println(status);
            System.out.println("Brightness: "+bright);

        }

    }

    public void someMethodOfLamp(){
        Bulb bulb = new Bulb();
        bulb.output();
    }

}
