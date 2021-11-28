package oop;

public class MyMath {
 //   int meaw =4;
    private static int  counter = 0;

    static int add(int a, int b){
        return a+b;
    //    count++;
    }
    static int sub (int a, int b){
        return a-b;
    }
    static int mult (int a,int b){
        return a*b;
    }
   static double div (int a, int b){
        return a/b;
    }

    public  int getCount() {

        return counter;
    }
}
