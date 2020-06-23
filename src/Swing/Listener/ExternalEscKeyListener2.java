package Swing.Listener;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ExternalEscKeyListener2 extends KeyAdapter {

    JFrame source;

    public ExternalEscKeyListener2(JFrame source){
        this.source = source;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE){
            source.setVisible(false);
            source.dispose();
            System.exit(0);
        }
    }
}
