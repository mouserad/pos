package Swing.Components;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // erzeuge JLabel component
        JLabel label = new JLabel("Das ist der Label-Text!");
        label.setForeground(Color.blue);

        // fügt die Komponente zum Frame hinzu
        frame.add(label);

        frame.pack();

        frame.setVisible(true);

    }


}
