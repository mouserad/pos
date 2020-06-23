package Swing.Painting;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class PaintFrame extends JFrame {

    public PaintFrame(){
        super("Paint-Frame");

        this.setContentPane(new PaintPanel());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setSize(600,600);
        this.setVisible(true);
    }

    public static void main(String[] args) throws
            InterruptedException,
            InvocationTargetException {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaintFrame();
            }
        });
    }
}
