package Homework.GUI.SwingLoginMVC;

import Homework.GUI.SwingLoginMVC.model.Controller.Controller;
import Homework.GUI.SwingLoginMVC.model.Model.Model;
import Homework.GUI.SwingLoginMVC.model.View.View;

import javax.swing.*;

public class LoginMvcDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                testLogin();
            }
        });
    }

    public static void testLogin(){
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        view.setLoginListener(controller);
    }
}
