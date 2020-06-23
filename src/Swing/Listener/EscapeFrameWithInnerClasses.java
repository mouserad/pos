package Swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EscapeFrameWithInnerClasses
extends JFrame {

    public EscapeFrameWithInnerClasses(){
        super("Escape Frame With Inner Classes");

        this.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                g.setFont(new Font("Sans",Font.PLAIN,20));
                g.drawString("Press ESC to quit...",10,50);
            }
        });

        this.addKeyListener(new EscapeKeyListener());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private class EscapeKeyListener
    extends KeyAdapter{

        @Override
        public void keyReleased(KeyEvent keyEvent) {
            if(keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE){
                setVisible(false);
                dispose();
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EscapeFrameWithInnerClasses();
            }
        });
    }


}
