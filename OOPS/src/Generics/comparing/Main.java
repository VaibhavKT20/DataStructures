package Generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students vaibhav=new Students(12,89.6f);
        Students kunal=new Students(2,99.6f);
        Students arpit=new Students(3,98.65f);
        Students rahul=new Students(4,96.5f);
        Students karan=new Students(5,94.4f);
        Students[] list={vaibhav,kunal,arpit,rahul,karan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);





//
//        if(kunal.compareTo(vaibhav)>0){
//            System.out.println("Kunal has more marks");
//        }
//        else{
//            System.out.println("Vaibhav has more marks");
//        }
    }
}
