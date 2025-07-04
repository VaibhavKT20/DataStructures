public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder name1=new StringBuilder("Hello");
        StringBuilder name2=new StringBuilder("Hello");
        StringBuilder name3=new StringBuilder("Hello");
        StringBuilder name4=name1;

//        System.out.println(name1.equals(name2));
//        System.out.println(name2.equals(name3));
//        System.out.println(name3.equals(name4));
//        System.out.println(name1.equals(name4));

        System.out.println(name1==name2);
        System.out.println(name2==name3);
        System.out.println(name3==name4);
        System.out.println(name1==name4);

        name4.append("World");

//        System.out.println(name1.equals(name2));
//        System.out.println(name2.equals(name3));
//        System.out.println(name3.equals(name4));
//        System.out.println(name1.equals(name4));

        System.out.println(name1==name2);
        System.out.println(name2==name3);
        System.out.println(name3==name4);
        System.out.println(name1==name4);
    }
}
