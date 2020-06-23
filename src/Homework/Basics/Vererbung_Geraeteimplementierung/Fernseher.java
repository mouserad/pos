package Homework.Basics.Vererbung_Geraeteimplementierung;

public class Fernseher extends Gerät {

    private int diagonale;

    public int getDiagonale() {
        return diagonale;
    }

    public void setDiagonale(int diagonale) {
        this.diagonale = diagonale;
    }

    public void fernsehen(){
        if(getStrom() == false){
            System.out.println("Der Fernseher bleibt schwarz.");
        }
        else{
            System.out.println("Es laufen nur Talkshows und Dauerwerbesendungen!");
        }
    }

}
