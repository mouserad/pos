package Swing.Basics;

import javax.swing.*;

public class FirstFrame {
    public static void main(String[] args) {

        JFrame f = new JFrame("My First Frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(100,100);
        f.setSize(600,600);
        f.setVisible(true);
    }

}
