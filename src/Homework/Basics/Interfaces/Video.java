package Homework.Basics.Interfaces;

public class Video extends MediaAdapter{

    @Override
    public void play() {
        System.out.println("Play Video");
    }

    @Override
    public void stop() {
        System.out.println("Stop Video");
    }

    @Override
    public void display() {
        System.out.println("Display Video");
    }

}
