package Interfaces.Extend2;

public class Main implements A,B{
    @Override
    public void fun() {
        A.super.fun();
    }

    @Override
    public void greet() {
        B.super.greet();
    }
}
