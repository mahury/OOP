package oop;

public class UserSocial extends User{
    String name;
    int age;

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }
}
