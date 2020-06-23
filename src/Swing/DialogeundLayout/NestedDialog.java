package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class NestedDialog extends JFrame {

    public NestedDialog(){
        super("Nested Dialog");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] btnLabels = {"Redraw","Invert","Do"};

        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2,2));

        cp.add(new JLabel("Example for a nested Layout",JLabel.CENTER),
                BorderLayout.NORTH);
        cp.add(createCenterPanel(),BorderLayout.CENTER);
        cp.add(createSouthPanel(),BorderLayout.SOUTH);
        cp.add(new ButtonPanel(btnLabels),BorderLayout.EAST);

        this.pack();
        this.setVisible(true);
    }

    private Component createCenterPanel(){
        JPanel retVal = new JPanel(new BorderLayout());
        retVal.setBorder(BorderFactory.createEtchedBorder());
        retVal.add(new JLabel("The painting area",JLabel.CENTER),BorderLayout.NORTH);
        retVal.add(new JPanel(),BorderLayout.CENTER);
        return retVal;
    }

    private JPanel createSouthPanel(){
        JPanel retVal = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        retVal.add(new JButton("Save"));
        retVal.add(new JButton("Exit"));
        return retVal;
    }

    public static void main(String[] args) {
        new NestedDialog();
    }
}

class ButtonPanel extends JPanel{
    public ButtonPanel(String[] labels){
        this.setLayout(new GridLayout(0,1));
        for(String lbl : labels)
            this.add(new JButton(lbl));
    }
}