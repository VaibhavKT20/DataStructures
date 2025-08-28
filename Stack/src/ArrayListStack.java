import java.util.ArrayList;

public class ArrayListStack {
    ArrayList<Integer> list=new ArrayList<>();
    void push(int x){
        list.add(x);
    }
    int pop(){
        int res=list.get(list.size()-1);
        list.remove(list.size()-1);
        return res;
    }
    int peek(){
        return list.get(list.size()-1);
    }
    int size(){
        return list.size();
    }
    boolean isEmpty(){
        return list.isEmpty();
    }
}
class Test1{
    public static void main(String[] args) {
        MyStack s=new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(30);
        s.push(30);

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
