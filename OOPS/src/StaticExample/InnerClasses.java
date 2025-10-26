package StaticExample;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj=new Test("Vaibhav");
        Test obj2=new Test("Rahul");
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
