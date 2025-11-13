package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int []arr;
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//
//    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,5,6,7,8};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        //this is a shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //this is a Deep copy
        Human twin =(Human)super.clone(); //this is shallow copy

        //make a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }

}
