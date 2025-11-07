package Polymorphism;

public class Triangle extends Shapes{
    @Override
    void area(){
        System.out.println("Area is 0.5*l*h");
    }
//    @Override not override example
    void area2(){
        System.out.println("This is not overriden");
    }


}
