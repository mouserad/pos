package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class FlowDialog extends JFrame {

    public FlowDialog(){
        super("FlowDialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = this.getContentPane();

        cp.setLayout(new FlowLayout(FlowLayout.LEFT,40,20));
        cp.add(new JButton("Yes"));
        cp.add(new JButton("No"));
        cp.add(new JButton("Perhaps"));
        cp.add(new JButton("Don't Know"));
        cp.add(new JButton("Cancel"));

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowDialog();
    }
}
