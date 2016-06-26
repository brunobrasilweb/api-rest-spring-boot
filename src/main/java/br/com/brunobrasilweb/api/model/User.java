package br.com.brunobrasilweb.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends AbstractModel<Long> {

    private String name;
    private String email;
    @Column(unique = true, nullable = false)
    private String login;
    private String password;


    public User() {}


    public User(String name, String email, String login, String password) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
