package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vaibhav=new Human(22,"Vaibahv Kumar");
//        Human twin=new Human(vaibhav);
//        System.out.println(twin.age);
//        System.out.println(twin.name);

        Human twin=(Human)vaibhav.clone();
        System.out.println(twin.name+" "+twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(vaibhav.arr)); //this is shallow copy




    }
}

