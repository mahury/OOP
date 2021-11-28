package oop;

public class UserSocial extends User{
    private String name;
    private int age;

    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUser(){
        System.out.println( "age " + getAge() + " login " + getLogin() );
    }


}
