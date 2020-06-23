package Homework.GUI.SwingLoginMVC.model.Controller;


import Homework.GUI.SwingLoginMVC.model.Model.Model;
import Homework.GUI.SwingLoginMVC.model.Model.User;
import Homework.GUI.SwingLoginMVC.model.View.LoginFormEvent;
import Homework.GUI.SwingLoginMVC.model.View.LoginListener;
import Homework.GUI.SwingLoginMVC.model.View.View;


public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public boolean loginPerformed(LoginFormEvent event) {
        if(new User(event.getUsername(), event.getPassword()).equals(model.getUser())){
            return true;
        }
        else {
            return false;
        }
    }
}
