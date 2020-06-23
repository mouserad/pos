package Swing.Listener;

import javax.swing.*;
import java.awt.*;

public class MutableBackground extends JFrame {

    public MutableBackground(){
        super("Key Frame - Color depending on Mouse");

        Container cp = this.getContentPane();
        cp.addMouseMotionListener(new ColorMouseListener());
        cp.addKeyListener(new ColorKeyListener());
        cp.setFocusable(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MutableBackground();
            }
        });
    }
}
