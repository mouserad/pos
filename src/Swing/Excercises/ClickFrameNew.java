package Swing.Excercises;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickFrameNew extends JFrame {

    private int x;
    private int y;

    public ClickFrameNew(){
        super("Click Frame New");

        ClickPanelNew panel = new ClickPanelNew();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                x = mouseEvent.getX();
                y = mouseEvent.getY();
                System.out.println("X: "+x+"/Y: "+y);
                repaint();
            }
        });

        this.setContentPane(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClickFrameNew();
            }
        });
    }





}
