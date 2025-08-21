import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Gfg");
        h.add("Course");
        h.add("ide");
        Iterator<String> i= h.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }


}
