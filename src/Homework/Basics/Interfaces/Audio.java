package Homework.Basics.Interfaces;

public class Audio extends MediaAdapter {

    @Override
    public void play() {
        System.out.println("Play Audio");
    }

    @Override
    public void stop() {
        System.out.println("Stop Audio");
    }

}
