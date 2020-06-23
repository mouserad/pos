package Exceptions;

public class Exercise4 {
    public Exercise4() {
        try {
            System.out.println( "10111011 ist " + BinaryStringToNumber.parseBinary( "10111011" ) );
            String s = "10511011";
            System.out.println( s + " ist " + BinaryStringToNumber.parseBinary( s ) );
        }
        catch (NoBinaryNumberException nbne){
            System.out.println("Fehler!: "+nbne.getMessage());
            //throw nbne;
        }
    }

    public static void main( String[] args ) {
        Exercise4 exercise4 = new Exercise4();
    }
}
