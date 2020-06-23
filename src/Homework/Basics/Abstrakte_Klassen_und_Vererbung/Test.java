package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public class Test {

    public static void main(String[] args) {

        ZeitFormat z1;
        ZeitFormat z2;
        ZeitFormat z3;
        ZeitFormat z4;
        ZeitFormat z5;
        ZeitFormat z6;

        z1 = new ZeitFormat12(5,40);
        z2 = new ZeitFormat12(23,10);
        z3 = new ZeitFormat12(12,15);
        z4 = new ZeitFormat24(0,30);
        z5 = new ZeitFormat24(23,10);
        z6 = new ZeitFormat24(12,15);

        z1.ausgabe();
        z2.ausgabe();
        z3.ausgabe();
        z4.ausgabe();
        z5.ausgabe();
        z6.ausgabe();

        System.out.println(z1.equals(z2));
        System.out.println(z3.equals(z6));


        Zeit z7 = new Zeit(13,25);
        Zeit z8 = (Zeit)z7.clone();
        System.out.println(z8.equals(z7));


    }

}
