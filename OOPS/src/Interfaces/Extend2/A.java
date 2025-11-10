package Interfaces.Extend2;

public interface A {
    default void fun(){
        System.out.println("I am in extends2 fun");
    }
}
