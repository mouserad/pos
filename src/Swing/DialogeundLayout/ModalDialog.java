package Swing.DialogeundLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalDialog extends JDialog implements ActionListener {

    public static enum Answere {NO,YES};

    private JButton yesButton = new JButton("Yes");
    private JButton noButton = new JButton("No");
    private Answere result = Answere.NO;

    public ModalDialog(JFrame owner, String question){
        super(owner,"Modal Dialog", true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout(2,2));
        cp.add(new JLabel(question, JLabel.CENTER),BorderLayout.NORTH);

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(yesButton);
        yesButton.addActionListener(this);
        southPanel.add(noButton);
        noButton.addActionListener(this);
        cp.add(southPanel,BorderLayout.SOUTH);

        this.pack();
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==yesButton){
            result = Answere.YES;
        }

        this.setVisible(false);
        this.dispose();
    }

    public Answere getResult(){
        return result;
    }

    public static Answere showQuestion(JFrame owner, String question){
        ModalDialog dlog = new ModalDialog(owner,question);

        dlog.setVisible(true);
        return dlog.getResult();
    }

}
