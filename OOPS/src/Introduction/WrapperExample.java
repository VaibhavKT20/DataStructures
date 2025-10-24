package Introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
        Integer num=45;
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+ b);

        final int bonus=2;
//        bonus=3; can't modify

        final A myName=new A("Vaibhav Kumar");
        myName.name="other name";
        // when a non primitive is final, you cannot reassign it
//        myName=new A("any other name");
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

}

class A{
//    final int num; always initialize it while declaring it

    final int num=10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
