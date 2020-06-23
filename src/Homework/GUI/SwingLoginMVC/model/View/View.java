package Homework.GUI.SwingLoginMVC.model.View;

import Homework.GUI.SwingLoginMVC.model.Model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class View extends JFrame implements ActionListener {
    private Model model;

    private Container cp = getContentPane();

    private JLabel labelUser;
    private JLabel labelPass;
    private JTextField textUser;
    private JPasswordField passwordField;
    private JCheckBox checkBox;
    private JButton buttonLogin;
    private JButton buttonReset;

    private LoginListener loginListener;

    public View(Model model){
        this.model = model;

        createWindow();
        createMenu();
        createComponents();
        addComponents();
        setLayoutManager();
        positionAndSizeOfComponents();
    }

    public void createWindow() {
        //create Window
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(400, 400);
        this.setSize(350, 300);
        this.setResizable(false);
        this.setVisible(true);
    }


    public void createMenu() {
        //create Menu Bar
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        //create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu sourceMenu = new JMenu("Source");

        //add Menus to Menu Bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(sourceMenu);

        //create Icon and Menu-Item Exit
        ImageIcon icon = new ImageIcon(getClass().getResource("cancel.png"));
        JMenuItem menuItem = new JMenuItem("Exit", icon);
        menuItem.setMnemonic(KeyEvent.VK_E);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
        menuItem.addActionListener((event)->System.exit(0));
        fileMenu.add(menuItem);
    }


    public void createComponents() {
        //create Components - ziemlich unnötig, meines Erachtens, dafür eine eigene Methode zu verwenden :=)
        labelUser = new JLabel("Username:");
        labelPass = new JLabel("Passwort:");
        textUser = new JTextField();
        passwordField = new JPasswordField();
        checkBox = new JCheckBox("Passwort anzeigen");
        buttonLogin = new JButton("Login");
        buttonReset = new JButton("Reset");
    }


    public void addComponents() {
        //add the components to the container
        cp.add(labelUser);
        cp.add(labelPass);
        cp.add(textUser);
        cp.add(passwordField);
        cp.add(checkBox);
        cp.add(buttonLogin);
        cp.add(buttonReset);

        //add Action Events to components
        checkBox.addActionListener(this);
        buttonLogin.addActionListener(this);
        buttonReset.addActionListener(this);


    }


    public void setLayoutManager() {
        cp.setLayout(null);
    }


    public void positionAndSizeOfComponents() {
        labelUser.setSize(100, 30);
        labelUser.setLocation(50, 20);

        labelPass.setSize(100, 30);
        labelPass.setLocation(50, 50);

        textUser.setSize(150, 30);
        textUser.setLocation(150, 20);

        passwordField.setSize(150, 30);
        passwordField.setLocation(150, 50);

        checkBox.setSize(150, 30);
        checkBox.setLocation(150, 80);

        buttonLogin.setSize(100, 30);
        buttonLogin.setLocation(50, 140);

        buttonReset.setSize(100, 30);
        buttonReset.setLocation(200, 140);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Show or hide Password
        if (e.getSource() == checkBox) {
            if (checkBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
        // Check Login Credentials
        if (e.getSource() == buttonLogin) {
            String userName = textUser.getText();
            String userPassword = new String(passwordField.getPassword());

            makeLoginEvent(new LoginFormEvent(userName, userPassword));
        }
        // Reset Username and Password
        if (e.getSource() == buttonReset) {
            textUser.setText("");
            passwordField.setText("");
        }
    }

    public void setLoginListener(LoginListener loginListener){
        this.loginListener = loginListener;
    }

    public void makeLoginEvent(LoginFormEvent event){
        if(loginListener != null){
            if(loginListener.loginPerformed(event)){
                System.out.println("Login erfolgreich");
                JOptionPane.showMessageDialog(this, "Login erfolgreich");
            }
            else {
                System.out.println("Login fehlgeschlagen");
                JOptionPane.showMessageDialog(this, "Login fehlgeschlagen");
            }
        }
    }



}
