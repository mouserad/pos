package Swing.Mvc;

public class Model {

    private User user;

    public Model(){
        user = new User("Max","Mustermann");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
