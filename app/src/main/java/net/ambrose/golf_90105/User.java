package net.ambrose.golf_90105;

public class User {

    private int id;
    private String username, firstname, lastname, email;

    public User(int id, String username, String email, String firstname, String lastname) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}