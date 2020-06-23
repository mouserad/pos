package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class BorderDialog extends JFrame {

    public BorderDialog(){
        super("BorderDialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = this.getContentPane();

        cp.setLayout(new BorderLayout());
        cp.add(new JButton("Yes"),BorderLayout.NORTH);
        cp.add(new JButton("No"),BorderLayout.EAST);
        cp.add(new JButton("Perhaps"),BorderLayout.WEST);
        cp.add(new JButton("Don't Know"),BorderLayout.CENTER);
        cp.add(new JButton("Cancel"),BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderDialog();
    }
}
