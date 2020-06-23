package Homework.Basics.Vererbung_Geraeteimplementierung;

public class Geschirrspüler extends Gerät {

    private String geschirrspülmittel;

    public String getGeschirrspülmittel() {
        return geschirrspülmittel;
    }

    public void setGeschirrspülmittel(String geschirrspülmittel) {
        this.geschirrspülmittel = geschirrspülmittel;
    }

    public void spülen(){
        if(getStrom() == false){
            System.out.println("Der Nachbar ist sehr empört über das dreckige Geschirr!");
        }
        else{
            System.out.println("Jetzt klappts auch mit dem Nachbarn!");
        }
    }
}
