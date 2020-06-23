package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public class ZeitFormat12 extends ZeitFormat {

    public ZeitFormat12(int s, int m){
            super(s, m);
           }

    @Override
    public void ausgabe() {
        if(getStunde()==0){
            System.out.println("Uhrzeit Zeitformat 12= 12:"+getMinute()+" a.m.");
        }
        else if(getStunde()==12){
            System.out.println("Uhrzeit Zeitformat 12= 12:"+getMinute()+" p.m.");
        }
        else if(getStunde()>12){
            System.out.println("Uhrzeit Zeitformat 12= "+(getStunde()-12)+":"+getMinute()+" p.m.");
        }
        else{
            System.out.println("Uhrzeit Zeitformat 12= "+getStunde()+":"+getMinute()+" a.m.");
        }
    }
}
