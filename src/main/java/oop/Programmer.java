package oop;

public class Programmer extends Person{
    private int exp;

    public Programmer(String name, String city, int age, int exp) {
        super(name, city, age);
        this.exp= exp;
    }

    public Programmer(String name, String city, int age) {
        super(name, city, age);
        this.exp=0;
    }
    public String getTextInfo(){
        return "name " + this.name + " city "+ this.city + " age " + this.age + " опыт " + exp;

    }
}
