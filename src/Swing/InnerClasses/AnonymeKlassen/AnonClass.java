package Swing.InnerClasses.AnonymeKlassen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonClass extends JFrame {

    public AnonClass(){
        JButton button = new JButton("Klick");
        // nun kommt der Anonyme Klassen ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // jetzt kommt ein Anonyme Klassen Viereck
                System.out.println(new Rectangle(100,50){
                    public String toString(){
                        return "Masse des Rechtecks "+getWidth() +"x" +getHeight();
                    };
                });
            }
        });

        this.add(button,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Anonyme Klasse Beispiel");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new AnonClass();
    }

}
