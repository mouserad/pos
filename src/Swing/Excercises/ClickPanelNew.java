package Swing.Excercises;

import javax.swing.*;
import java.awt.*;

public class ClickPanelNew extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setFont(new Font("Arial",Font.PLAIN,12));
        //graphics.drawString("X: "+ClickFrameNew.this.x+"/Y: ",100,100);
    }
}
