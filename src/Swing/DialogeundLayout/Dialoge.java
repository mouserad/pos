package Swing.DialogeundLayout;

import javax.swing.*;

public class Dialoge extends JFrame{

    public Dialoge() {
        JOptionPane.showMessageDialog(this.getContentPane(),
                "Eggs are not supposed to be green.",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(this.getContentPane(),
                "Eggs are not supposed to be green.",
                "A plain message",
                JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showConfirmDialog(this.getContentPane(),
                "Would you like green egs and ham?",
                "A Silly Question",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        String answer = JOptionPane.showInputDialog(
                this.getContentPane(),
                "Complete the sentence:\n"+"'Green eggs and...'",
                "Panel Game",
                JOptionPane.WARNING_MESSAGE
        );

        System.out.println(answer);

    }

    public static void main(String[] args) {
        new Dialoge();

            }

}
