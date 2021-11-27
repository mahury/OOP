package oop;

public class Person {
    String name;
    String city;
    int age;
    private static int count=0;


    public Person(String name, String city, int age){
        this.name=name;
        this.city=city;
        this.age=age;
        count++;
    }
    public Person(){
//        this.name= "noname";
//        this.city="nowhere";
//        this.age=0;
        this("john doe","DC",18);
    }

    public static int getCount() {
        return count;
    }

    public String getTextInfo (){
        return "name " + this.name + " city "+ this.city + " age " + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void whoIsOlder(Person p){
        if (this.age > p.age) System.out.println(this.name + " older than " + p.name);
        else if (this.age== p.age) System.out.println(" совпадают ");
        else System.out.println( "младше");
    }
}
