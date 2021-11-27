package oop;

public class User {
    private int  id;
    private String login;
    private String password;
    private static int count =0;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        count++;
    }
    public User (){
        this(count +1000,"guest","");
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
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


}