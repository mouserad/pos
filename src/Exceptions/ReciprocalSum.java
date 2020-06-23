package Exceptions;

public class ReciprocalSum {

    public static void main(String[] args) {
        double x;
        try {
            int beg = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            x = progressionSum(beg, end);

            System.out.println("");
            System.out.println("Progression Result: " + x);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("error: " + e.toString());
            System.out.println("usage: java ReciprocalSum startValue endValue");
        } finally {
            System.out.println("EndOfProgram.");
        }


    }


    public static double progressionSum(int start, int stop) {
        double retVal = 0;

        for (int val = start; val <= stop; val++) {
            try {
                retVal = retVal + reciprocal(val);
                System.out.println("1/" + val + " ");
            }
            catch(DoubleDivisionByZeroException ex){
                //do nothing
            }
            }
        return retVal;
    }

    private static double reciprocal(double val) throws DoubleDivisionByZeroException {

        double retVal = 1 / val;
        if (Double.isInfinite(retVal))
            throw new DoubleDivisionByZeroException();


        return retVal;

    }

}
