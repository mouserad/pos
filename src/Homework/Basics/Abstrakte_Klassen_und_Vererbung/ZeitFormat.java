package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public abstract class ZeitFormat extends Zeit{

    public abstract void ausgabe();

    ZeitFormat(int s, int m){
        super(s, m);
    }

}
