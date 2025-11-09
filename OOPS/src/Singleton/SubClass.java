package Singleton;

import AccessControl.A;
import AccessControl.ObjectDemo;

public class SubClass extends A {
    SubClass(int num,String name){
        super(num,name);
    }
    public static void main(String[] args) {
        SubClass obj=new SubClass(22,"Vaibhav Kumar");
        int n=obj.num;
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);
    }

}

