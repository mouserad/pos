package Homework.Basics.Vererbung_Geraeteimplementierung;

public class Test {

    public static void main(String[] args) {

        Fernseher f = new Fernseher();
        Mikrowelle m = new Mikrowelle();
        Geschirrspüler g = new Geschirrspüler();

        f.setDiagonale(100);
        f.fernsehen();
        f.anstecken();
        f.fernsehen();
        System.out.println("Der Fernseher hat eine Bildschirmdiagonale von "+f.getDiagonale()+"cm.");

        m.setLeistung(800);
        m.wärmen();
        m.anstecken();
        m.wärmen();
        System.out.println("Die Mikrowelle hat eine Leistung von "+m.getLeistung()+" Watt.");

        g.setGeschirrspülmittel("Blitzo");
        g.spülen();
        g.anstecken();
        g.spülen();
        System.out.println("Der Geschirrspüler verwendet "+g.getGeschirrspülmittel());

    }

}
