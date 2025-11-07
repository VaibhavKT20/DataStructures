package Polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(double a,int b){
        return (int) (a+b);
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        int res=obj.sum(1,3);
        int res2=obj.sum(1,3,4);
        int res3=obj.sum(2.5,3);
//        obj.sum(5,4,3,7);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}
