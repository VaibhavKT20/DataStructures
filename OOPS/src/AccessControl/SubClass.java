package AccessControl;

public class SubClass extends A{

    public SubClass(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(45,"Vaibhav kumar");
        int n=obj.num;
    }
}
