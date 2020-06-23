package Homework.Basics.Interfaces;

public class TestMedia {

    public static void main(String[] args) {

        Picture p = new Picture();
        Video v = new Video();
        Audio a = new Audio();

        p.display();
        v.play();
        v.stop();
        v.display();
        a.play();
        a.stop();
    }

}
