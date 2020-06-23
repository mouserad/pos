package Swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EscapeFrame
        extends JFrame
        implements KeyListener {

    public EscapeFrame(){
        super("Escape Frame");

        this.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                g.setFont(new Font("Sans",Font.PLAIN,20));
                g.drawString("Press ESC to quit...",10,50);
            }
        });

        this.addKeyListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE){
            this.setVisible(false);
            this.dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EscapeFrame();
            }
        });
    }
}
