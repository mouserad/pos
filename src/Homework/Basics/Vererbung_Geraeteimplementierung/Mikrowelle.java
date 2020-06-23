package Homework.Basics.Vererbung_Geraeteimplementierung;

public class Mikrowelle extends Gerät {

    private int leistung;

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public void wärmen(){
        if(getStrom() == false){
            System.out.println("Die Mikrowelle tut nichts!");
        }
        else{
            System.out.println("Die Popcorn poppen!");
        }
    }
}
