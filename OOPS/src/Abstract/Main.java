package Abstract;

public class Main {
    public static void main(String[] args) {

        Son son=new Son(22);
        son.career();
        Parent daughter=new Daughter(21);
        daughter.career();
//        Parent mom=new Parent();  // cannot create object of an abstract class
//        Parent dad=new Parent(45) {
//            @Override
//            void career() {
//                System.out.println();
//            }
//            @Override
//            void partner() {
//                System.out.println();
//            }
//
//        };

        Parent.hello();
        son.normal();

    }
}
