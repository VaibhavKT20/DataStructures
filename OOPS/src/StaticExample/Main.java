package StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human vaibhav=new Human(23,"Vaibhav",100000,false);
//        Human rahul=new Human(24,"Rahul",150000,true);
//        Human arpit=new Human(24,"Arpit",250000,true);
//
//        System.out.println(vaibhav.name);
//        System.out.println(vaibhav.population);
//        System.out.println(rahul.population);
//        System.out.println(arpit.population);
//        greeting();
        Main funn=new Main();
        funn.fun2();
    }

    // We know that something which is not static belongs to an object
    void greeting(){
//        fun();
        System.out.println("hello world");
    }

    static void fun(){
        Main obj=new Main();
        obj.greeting(); // can't use this  because it requires an instance but the function you are using it in does not depend on instance
    }
    void fun2(){
        greeting();
    }
}
