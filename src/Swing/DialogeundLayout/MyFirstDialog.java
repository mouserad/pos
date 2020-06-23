package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class MyFirstDialog extends JFrame {

    public MyFirstDialog(){
        super("My First Dialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = this.getContentPane();

        cp.setLayout(new FlowLayout());
        cp.add(new JButton("OK"));
        cp.add(new JButton("Cancel"));

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFirstDialog();
    }

}
