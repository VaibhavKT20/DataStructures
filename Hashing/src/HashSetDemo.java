import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Gfg");
        h.add("Course");
        h.add("ide");
//        Iterator<String> i= h.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next()+" ");
//        }
        System.out.println(h.size());
        h.remove("ide");
        System.out.println(h.size());
        for(String s:h){
            System.out.println(s);
        }
        System.out.println(h.isEmpty());
        h.add("leetcode");
        System.out.println(h.size());
    }


}
