package Swing.Basics;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class MySecondFrame extends JFrame {

    public MySecondFrame() {
        super("My Second Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100, 100);
        this.setSize(600, 600);
        this.setVisible(true);
    }

    public static void main(String[] args)
            throws InterruptedException,
            InvocationTargetException {
        // nicht so benutzen, da es thread-unsafe ist
        // new MySecondFrame();

        // stattdessen so ausführen
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                new MySecondFrame();
            }
        });
        System.out.println("End of main!");
    }

}
