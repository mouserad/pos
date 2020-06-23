package Swing.Listener;

import javax.swing.*;
import java.awt.*;

public class EscapeFrameWithListenerExtern
extends JFrame {

    public EscapeFrameWithListenerExtern(){
        super("Escape Frame with Listener Extern");

        this.setContentPane(new JPanel(){
            public void paintComponent(Graphics g){
                g.setFont(new Font("Sans",Font.PLAIN, 20));
                g.drawString("Press ESC to quit...",10,50);
            }
        });

        // für Variante 1:
        this.addKeyListener(new ExternalEscKeyListener());

        // für Variante 2:
        // this.addKeyListener(new ExternalEscKeyListener2(this));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EscapeFrameWithListenerExtern();
            }
        });
    }



}
