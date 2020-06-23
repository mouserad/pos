package Homework.Basics.Vererbung_Geraeteimplementierung;

public class Gerät {

    private boolean strom;

    public boolean getStrom() {
        return strom;
    }

    public void anstecken() {
        this.strom = true;
    }
}
