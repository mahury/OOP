package oop;

public class Firm {
    public String nameFirm;
    public Director director;

    public Firm(String nameFirm, String nameDirecor, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirecor, age);


//          public Director(String name, )
        }
        class Director{
            public String name;
            public int age;

            public Director(String name, int age) {
                this.name = name;
                this.age = age;
                System.out.println("создан директор в фирме " + nameFirm);
            }
            public boolean isPensioner(){
                return age>60;
            }
    }
}
