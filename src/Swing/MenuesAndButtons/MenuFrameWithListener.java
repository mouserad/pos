package Swing.MenuesAndButtons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuFrameWithListener extends JFrame implements ActionListener {

    public MenuFrameWithListener(){
        super("Menu Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocation(400,400);
        this.setSize(500,300);

        JMenu menu;
        JMenuItem menuItem;

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        //File-Menu...
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        //add the Menu to the MenuBar
        menuBar.add(menu);

        //Create and add the MenuItems of the File-Menu...
        //...


        //Edit-Menu
        menu = new JMenu("Edit");
        menu.setMnemonic(KeyEvent.VK_E);
        //add the Menu to the MenuBar
        menuBar.add(menu);
        //Create the "New"-MenuItem
        menuItem = createNewMenu();
        menu.add(menuItem);

        //add a Separator
        menu.addSeparator();

        //create and add a MenuItem with Mnemonic and Accelerator (Strg+M)
        menuItem = new JMenuItem("Move",KeyEvent.VK_M);
        KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK);
        menuItem.setAccelerator(ks);
        menuItem.addActionListener(this);
        menuItem.setActionCommand("MOVE");
        menu.add(menuItem);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "MOVE":
                //....
                break;
            case "RESIZE":
                //....
                break;
        }
    }

    private JMenu createNewMenu(){
        JMenu menu = new JMenu("New");
        JMenuItem menuItem;
        ButtonGroup group = new ButtonGroup();

        //create and add a JRadioButtonMenuItem with Accelerator to the Submenu
        menuItem = new JRadioButtonMenuItem("Circle");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,InputEvent.CTRL_DOWN_MASK));
        menu.add(menuItem);
        group.add(menuItem);

        //select the first RadioButton
        menuItem.setSelected(true);

        //create and add a JRadioButtonMenuItem with Accelerator to the Submenu
        menuItem = new JRadioButtonMenuItem("Line");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,InputEvent.CTRL_DOWN_MASK));
        menu.add(menuItem);
        group.add(menuItem);

        return menu;
    }

    public static void main(String[] args) {
        new MenuFrameWithListener();
    }


}
