package Homework.Basics.Abstrakte_Klassen_und_Vererbung;

public class Zeit {

    private int stunde;
    private int minute;

    public Zeit(int s, int m){
        setStunde(s);
        setMinute(m);
    }

    public int getStunde() { return stunde;}

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        else if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        else if ( this.getStunde() == ((Zeit)o).getStunde()
                && this.getMinute() == ((Zeit)o).getMinute()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    protected Object clone(){
        Zeit z = new Zeit(getStunde(),getMinute());
        return z;
    }
}
