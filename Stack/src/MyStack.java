public class MyStack {
    int arr[];
    int cap;
    int top;
    MyStack(int c){
        cap=c;
        top=-1;
        arr=new int[cap];
    }
    void push(int x){
        if(top==cap){
            System.out.println("Stack Overflow");
        }
        top++;
        arr[top]=x;
    }
    int pop(){
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }
    int size(){
        return top+1;
    }
    int peek(){
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
class Test{
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