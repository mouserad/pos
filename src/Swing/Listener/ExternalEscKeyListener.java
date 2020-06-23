package Swing.Listener;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ExternalEscKeyListener extends KeyAdapter {

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE){
            JFrame source = (JFrame) keyEvent.getSource();
            source.setVisible(false);
            source.dispose();
            System.exit(0);
        }
    }
}
