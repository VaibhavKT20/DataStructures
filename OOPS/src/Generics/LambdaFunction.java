package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
//        arr.forEach((item)->{
//            System.out.println(item*2);
//        });
        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        arr.forEach(fun);
        Operation sum=(a,b)->a+b;
        Operation diff=(a,b)->a-b;
        Operation mul=(a,b)->a*b;
        Operation div=(a,b)->a/b;
        Operation mod=(a,b)->a%b;
        LambdaFunction myCalculator=new  LambdaFunction();
        System.out.println(myCalculator.operate(5,6,sum));
        System.out.println(myCalculator.operate(5,6,diff));
        System.out.println(myCalculator.operate(5,6,mul));
        System.out.println(myCalculator.operate(5,6,div));
        System.out.println(myCalculator.operate(5,6,mod));
    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

    int sum(int a,int b){
        return a+b;
    }
}

interface Operation{
    int operation(int a,int b);
}