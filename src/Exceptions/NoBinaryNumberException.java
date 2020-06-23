package Exceptions;

public class NoBinaryNumberException extends RuntimeException {

    public NoBinaryNumberException(){
        super();
    }

    public NoBinaryNumberException(String msg){
        super(msg);
    }

    public NoBinaryNumberException(String msg, int pos){
        super("Bei der übergebenen Zahl: "+msg+" ist an der "+pos+". Position ein Fehler!");
    }

}