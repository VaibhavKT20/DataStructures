package Singleton;

import AccessControl.A;

public class Main {
    public static void main(String[] args) {
//        Singleton obj=new Singleton(); //private constructor
//        obj.num; // private variable
//        Singleton obj=Singleton.getInstance();
//        Singleton obj2=Singleton.getInstance();
//        Singleton obj3=Singleton.getInstance();

        A a=new A(10,"kumar");
        System.out.println(a.getNum());
//        int n=a.num; //its private
//        int m=a.num;
    }
}
