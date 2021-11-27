package oop;

public class OOP1 {
    public static void main(String[] args){
        Person p = new Person("Michael", "Moscow", 37);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("jack", "Moscow", 32);
        p_arr[1] = new Person("Mike", "Moscow", 34);
        p_arr[2] = new Person("nike", "Moscow", 33);
        for (Person person : p_arr) {
            System.out.println(person.name + " " + person.city + " " + person.age);
        }
        for (Person temp : p_arr){
            System.out.println(temp.name + " " + temp.city + " "+ temp.age);

        }
        User[] u_arr = new User[3];
        u_arr[0]= new User(1,"one","123");
        u_arr[1]= new User(2,"two","1235");
        u_arr[2]= new User(3,"three","1234");

        for (User user : u_arr) {
            System.out.println("id=" + user.id + "; логин=" + user.login + "; password=" + user.password);
        }
        Person p1 = new Person("Igor","omsk",20);
        System.out.println(p1.getTextInfo());

        p1.setName("oleg");
        p1.setCity("orsk");
        p1.setAge(76);
        System.out.println(p1.getAge());
        System.out.println(p1.getCity());
        System.out.println(p1.getName());
        Person p2 = new Person("nik", "tver", 82);
        p2.whoIsOlder(p1);



    }

}
