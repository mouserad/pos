package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public class ZeitFormat24 extends ZeitFormat {

    public ZeitFormat24(int s, int m){
        super(s, m);
    }

    @Override
    public void ausgabe() {
        System.out.println("Uhrzeit Zeitformat 24= "+getStunde()+":"+getMinute()+" Uhr.");
    }
}
