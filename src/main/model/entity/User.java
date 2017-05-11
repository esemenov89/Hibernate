package main.model.entity;

/**
 * Created by Aleksei Lysov on 20.04.2017.
 */
public class User {
    private int id;
    private String login;
    private String password;
    private boolean blocked;

    public User(int id, String login, String password, boolean blocked) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.blocked = blocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blocked=" + blocked +
                '}';
    }
}
