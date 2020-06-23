package Swing.Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ColorKeyListener extends KeyAdapter {

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        JComponent comp = (JComponent) keyEvent.getComponent();

        switch (keyEvent.getKeyChar()){
            case 'r':
                comp.setBackground(Color.red);
                break;
            case 'g':
                comp.setBackground(Color.green);
                break;
            case 'b':
                comp.setBackground(Color.blue);
                break;
        }
    }
}
