package Homework.GUI.ClickPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ClickFrame extends JFrame {

    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ClickFrame(){
        super("Click Frame");

        ClickPanel panel = new ClickPanel();

        this.setContentPane(panel);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                    setX(mouseEvent.getX());
                    setY(mouseEvent.getY());
                    repaint();
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public class ClickPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            graphics.setFont(new Font("Sans",Font.PLAIN,14));
            graphics.drawString("X: "+x+"/Y: "+y,x,y);
        }

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClickFrame();
            }
        });
    }


}
