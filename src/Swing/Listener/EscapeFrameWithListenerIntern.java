package Swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EscapeFrameWithListenerIntern
extends JFrame {

    public EscapeFrameWithListenerIntern(){
        super("Escape Frame Intern Listener");

        this.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                g.setFont(new Font("Sans",Font.PLAIN,20));
                g.drawString("Press ESC to quit...",10,50);
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE){
                    setVisible(false);
                    dispose();
                    System.exit(0);
                }
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EscapeFrameWithListenerIntern();
            }
        });
    }

}
