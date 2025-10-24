//     class is a logical construct
//     object physical reality
//    Class:
//    A class is a blueprint or template for creating objects.
//    It defines data members (variables) and member functions (methods) that describe the behavior and properties of an object.
//            Example: A class is like a plan or design for a house.
//
//    Object:
//    An object is a real-world instance of a class.
//    It has its own data and can use the methods defined in the class.
//    Example: An object is like the actual house built from that plan.

package Introduction;
class Student{
    int rno;
    String name;
    float marks;

//  A constructor is a special method in a class that is automatically called when an object is created.
//  Its main purpose is to initialize the object’s data members.


    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
//  The this keyword in Java is a reference variable that refers to the current object of the class.
//  It is used to differentiate between instance variables and local variables when they have the same name, and to refer to the current class members.

    //constructor overloading
    Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    void greeting(){
        System.out.println("Hello! My name is "+this.name);
    }
    void changeName(String newName){
        this.name=newName;
    }

}
public class Main {
    public static void main(String[] args) {
        Student student1=new Student(123,"Vaibhav",85);

        System.out.println(student1.rno);
        student1.greeting();
//        student1.changeName("Raghav");
//        student1.greeting();
        Student random=new Student(student1);
        System.out.println(random.name);




    }



}
