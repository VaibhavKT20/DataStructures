package AccessControl;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num) {
        this.num=num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(22);
//        ObjectDemo obj2=obj;
        ObjectDemo obj2=new ObjectDemo(22);
//        System.out.println(o
//        bj.hashCode());
//        System.out.println(obj2.hashCode());
        System.out.println(obj.equals(obj2));
        System.out.println(obj==obj2);
        System.out.println(obj.getClass());
    }
}
