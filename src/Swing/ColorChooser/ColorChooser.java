package Swing.ColorChooser;

import javax.swing.*;
import java.awt.*;

public class ColorChooser {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Color newColor = JColorChooser.showDialog(frame, "Dialog Title", Color.BLACK);
        System.out.println(newColor);
    }

}
