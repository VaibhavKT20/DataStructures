package Interfaces.Extend2;

public interface B {
    default void greet(){
        System.out.println("I am in extend2 greet");
    }
}
