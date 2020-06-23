package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public class Uhrzeit {

    public static boolean entspricht(Zeit z1, Zeit z2){
        if(z1.getStunde() == z2.getStunde()
                && z1.getMinute() == z2.getMinute()){
            return true;
        }
        else{
            return false;
        }
    }

}
