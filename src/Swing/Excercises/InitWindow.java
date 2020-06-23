package Swing.Excercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class InitWindow {

    private JLabel label;

    public InitWindow(){
        initWindow();
    }

    private void initWindow()
    {
        // Initialize the JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Mein Super Schönes Programm");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the Panel
        JPanel panel = new JPanel();
        //panel.setSize(400, 400);
        //panel.setLayout(new BorderLayout());

        // Initialize the Label
        label = new JLabel();
        label.setSize(100, 100);
        label.setText("X:    Y:   ");

        // add MouseMotionListener to the Panel
        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                label.setText("X: " + String.valueOf(e.getX() + "/Y: " + String.valueOf(e.getY())));
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("X: " + e.getX() + "/Y: " + e.getY());
            }
        });

        panel.add(label, BorderLayout.NORTH);


        frame.add(panel);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new InitWindow();
    }

}
