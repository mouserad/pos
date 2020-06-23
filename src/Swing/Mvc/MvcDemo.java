package Swing.Mvc;

import javax.swing.*;

public class MvcDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp(){
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        view.setLoginListener(controller);
    }
}
