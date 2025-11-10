package Abstract;

abstract public class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE=3456789;
    }
//    abstract Parent(){
//
//    } //Not allowed

    static void hello(){
        System.out.println("hello!");
    }
    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();

}
