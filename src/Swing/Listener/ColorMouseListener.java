package Swing.Listener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorMouseListener extends MouseAdapter {

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        //super.mouseMoved(mouseEvent);

        Color newBackColor = new Color(mouseEvent.getX()%255,
                mouseEvent.getY()%255,
                (mouseEvent.getX()+mouseEvent.getY())%255);

        Component comp = mouseEvent.getComponent();
        comp.setBackground(newBackColor);

    }
}
