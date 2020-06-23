package Swing.InnerClasses.AnonymeKlassen;

public class AnonymousClassDemo {

    public static void main(String[] args) {
        new Person("Mustermann"){
            @Override
            void printName(){
                System.out.println("Mein Name ist: "+this.getName());
            }
        };
    }
}

class Person {
    private String name;

    public Person(String name){
        this.name = name;
        printName();
    }

    void printName(){
        System.out.println(name);
    }

    String getName(){
        return this.name;
    }
}
