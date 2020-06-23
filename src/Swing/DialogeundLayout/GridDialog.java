package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class GridDialog extends JFrame {

    public GridDialog(){
        super("GridDialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = this.getContentPane();

        cp.setLayout(new GridLayout(0,2));
        cp.add(new JButton("Yes"));
        cp.add(new JButton("No"));
        cp.add(new JButton("Perhaps"));
        cp.add(new JButton("Don't Know"));
        cp.add(new JButton("Cancel"));

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridDialog();
    }
}
