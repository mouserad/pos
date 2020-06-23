package Homework.Basics.Array_Older_Persons;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {

        double avg = 0;
        double summe = 0;
        String namecheck;

        String[][] personArray = new String[(args.length/2)][2];

        for(int i = 0; i<args.length; i++){
            if(i%2 == 0){
                personArray[(i/2)][0] = args[i];
            }
            else{personArray[(i/2)][1] = args[i];}
        }

        System.out.println("The whole crowd:");
        for(int i = 0; i < personArray.length; i++){
            System.out.println(personArray[i][0]+", "+personArray[i][1]+" years.");
        }

        for(int i = 0; i < personArray.length; i++){
            double d = new Double(personArray[i][1]).doubleValue();
            summe += d;
        }
        avg = summe/personArray.length;

        System.out.println("The older ones (avg = "+avg+"):");

        for(int i = 0; i < personArray.length; i++){
            double d = new Double(personArray[i][1]).doubleValue();
            if(d > avg){
                System.out.println(personArray[i][0]+", "+personArray[i][1]+" years.");
            }
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name you are looking for: ");
        namecheck = s.nextLine();

        for(int i = 0; i < personArray.length; i++){
            if(namecheck.equals(personArray[i][0])){
                System.out.println(personArray[i][0]+", "+personArray[i][1]+" years.");
            }
        }

    }

}
