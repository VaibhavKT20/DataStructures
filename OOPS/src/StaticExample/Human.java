package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello world");
//        System.out.println(this.age); // cant use this over here because in static we cant use non-static stuff;
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
