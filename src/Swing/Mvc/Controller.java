package Swing.Mvc;

public class Controller implements LoginListener {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public boolean loginPerformed(LoginFormEvent event) {
        System.out.println("Login Event Received. "+event.getName()+" ; "+event.getPassword());

        if(new User(event.getName(), event.getPassword()).equals(model.getUser())){
            return true;
        }
        else {
            return false;
        }
    }
}
