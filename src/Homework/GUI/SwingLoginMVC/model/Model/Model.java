package Homework.GUI.SwingLoginMVC.model.Model;

public class Model {
    private User user;

    public Model(){
        user = new User("milli","vanilli");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
