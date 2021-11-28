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
            System.out.println("id=" + user.getId() + "; логин=" + user.getLogin() + "; password=" + user.getPassword());
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

        User u2 = new User();
        System.out.println(u2.getLogin());
        System.out.println(u2.getId());
        u2.setId(5);
        u2.setLogin("usver");
        u2.setPassword("pass");
        System.out.println(u2.getId());
        System.out.println(u2.getLogin());
        System.out.println("counter "+ p2.getCount());
        System.out.println(u2.getCount());
        System.out.println(MyMath.add(2,8));
        System.out.println(MyMath.sub(2,8));
        System.out.println(MyMath.mult(2,8));
        System.out.println(MyMath.div(4,2));
  //      System.out.println(MyMath.getCount());
        UserSocial us1 = new UserSocial(7, "mike", "544", "mike", 56);
        WebMaster w1 = new WebMaster(8, "ann", "333", "abc.com");
        us1.setAge(47);
        System.out.println(us1.getName());
        System.out.println(us1.getId());
        w1.setSite("bds.mk");
        System.out.println(w1.getSite());

        Firm f = new Firm("meaw","ike",76);
        System.out.println(f.nameFirm);
        System.out.println(f.director.name);
        System.out.println(f.director.isPensioner());







    }

}
