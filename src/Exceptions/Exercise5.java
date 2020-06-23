package Exceptions;

public class Exercise5 {
    public Exercise5() {
        try {
            System.out.println( "10111011 ist " + BinaryStringToNumber.parseBinary( "10111011" ) );
            String s = "10511011";
            System.out.println( s + " ist " + BinaryStringToNumber.parseBinary( s ) );
        }
        catch (NoBinaryNumberException nbne){
            System.out.println("Fehler!: "+nbne.getMessage());
            //throw nbne;
        }
        finally {
            System.out.println("Programmende.");
        }
    }

    public static void main( String[] args ) {
        Exercise5 exercise5 = new Exercise5();
    }
}
