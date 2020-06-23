package Swing.FileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

    public static void main(String[] args) throws
            ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        JFrame frame = new JFrame();
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images","jpg","jpeg","gif"
        );
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(frame);
        if(returnVal==JFileChooser.APPROVE_OPTION){
            System.out.println("You chose to open this file: "+
                    chooser.getSelectedFile().getName());
        }
    }


}
