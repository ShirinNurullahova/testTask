package BankSystem.src;

public class User {
    public int id;
    public String name;
    public String surName;
    public String email;
    public String password;

    public User(int id, String name, String surName, String password, String email) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
