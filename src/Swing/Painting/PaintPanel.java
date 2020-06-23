package Swing.Painting;

import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // hier die zeichenoperation einfügen
        // Linie
        // g.drawLine(0,0,this.getWidth(),this.getHeight());

        // Rechteck
        // g.drawRect(50,50,this.getWidth()/2-50,this.getHeight()/2-50);

        /* --Einfärben von Rechteck und Kreis
        g.setColor(Color.red);
        g.fillRect(50,50,this.getWidth()/2-50,this.getHeight()/2-50);

        int cx = this.getWidth()/2;
        int cy = this.getHeight()/2;
        int rad = 50;
        g.setColor(Color.blue);
        g.fillOval(cx-rad,cy-rad,2*rad,2*rad);

        g.setColor(Color.green);
        g.fillRect(cx,cy,this.getWidth()/2-50,this.getHeight()/2-50);

        */

        // Textausgabe
        // g.drawString("Hallo Swing",this.getWidth()/2,this.getHeight()/2);

        // Verschiedene Texartten und Größen
        g.setFont(new Font("SansSerif",Font.PLAIN,10));
        g.drawString("SansSerif PLAIN 10",10,this.getHeight()/6);

        g.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,20));
        g.drawString("SansSerif PLAIN 20",10,this.getHeight()/2);

        g.setFont(new Font("Monospaced",Font.BOLD,20));
        g.drawString("Monospaced BOLD 20",10,this.getHeight()-5);

        System.out.println("calling PainComponent");
    }
}
