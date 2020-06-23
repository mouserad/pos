package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class MySecondDialog extends JFrame {

    public MySecondDialog(){
        super("My Second Dialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cp = new JPanel(new FlowLayout());
        cp.add(new JButton("OK"));
        cp.add(new JButton("Cancel"));

        this.setContentPane(cp);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MySecondDialog();
    }

}
