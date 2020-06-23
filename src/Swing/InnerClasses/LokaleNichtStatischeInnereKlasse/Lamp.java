package Swing.InnerClasses.LokaleNichtStatischeInnereKlasse;

public class Lamp {
    private static String status = "Shine";
    private int bright = 1;

    public void lightMeUp(){
        final boolean isOn = false;

        class Bulb {
            void  output(){
                System.out.println(status);
                if(isOn){
                    System.out.println("Brightness: "+ Lamp.this.bright);
                }
            }
        }

        Bulb bulb = new Bulb();
        bulb.output();
    }
}
