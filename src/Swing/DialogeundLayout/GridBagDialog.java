package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;

public class GridBagDialog extends JFrame {

    public GridBagDialog(){
        super("Gridbag Dialog");

        GridBagConstraints gbConstr;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();

        //Create and set the Layout
        GridBagLayout gbLayout = new GridBagLayout();
        cp.setLayout(gbLayout);

        //Place the List
        String[] listData = {"Previous", "Added", "Text"};
        JList list = new JList();
        list.setListData(listData);
        cp.add(list);

        //Define the List-Constraints
        gbConstr = makegbc(0,0,1,3); //gridx, gridy, gridwith, gridheight
        gbConstr.weightx = 50;
        gbConstr.weighty = 100;
        gbConstr.fill = GridBagConstraints.BOTH;
        gbConstr.anchor = GridBagConstraints.CENTER; //No matter
        gbLayout.setConstraints(list, gbConstr);

        //Place Label
        JLabel label = new JLabel("Text");
        cp.add(label);

        //Define Label-Constraints
        gbConstr = makegbc(1,0,1,1);
        gbConstr.weightx = 0;                           //default
        gbConstr.weighty = 0;                           //default
        gbConstr.fill = GridBagConstraints.NONE;        //no matter
        gbConstr.anchor = GridBagConstraints.CENTER;    //no matter
        gbLayout.setConstraints(label, gbConstr);

        //Textfeld
        JTextField field = new JTextField();
        cp.add(field);
        gbConstr = makegbc(2,0,1,1);
        gbConstr.weightx = 50;
        gbConstr.weighty = 0;                           //default
        gbConstr.fill = GridBagConstraints.HORIZONTAL;
        gbConstr.anchor = GridBagConstraints.CENTER;    //no matter
        gbLayout.setConstraints(field, gbConstr);

        //Add-Button
        JButton addBtn = new JButton("Add to List");
        cp.add(addBtn);
        gbConstr = makegbc(2,1,1,1);
        gbConstr.weightx = 50;                          //default
        gbConstr.weighty = 50;
        gbConstr.fill = GridBagConstraints.HORIZONTAL;
        gbConstr.anchor = GridBagConstraints.NORTH;     //or NORTHWEST, NORTHEAST
        gbLayout.setConstraints(addBtn, gbConstr);

        //End-Button
        JButton endBtn = new JButton("End");
        cp.add(endBtn);
        gbConstr = makegbc(2,2,1,1);
        gbConstr.weightx = 50;                          //default
        gbConstr.weighty = 50;
        gbConstr.fill = GridBagConstraints.NONE;
        gbConstr.anchor = GridBagConstraints.SOUTHEAST;
        gbLayout.setConstraints(endBtn,gbConstr);

        this.pack();
        this.setVisible(true);
    }

    private GridBagConstraints makegbc(
            int x, int y, int width, int height) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        gbc.insets = new Insets(1,1,1,1);

        return gbc;
    }

    public static void main(String[] args) {
        new GridBagDialog();
    }

}
