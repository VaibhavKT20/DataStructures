import java.util.HashMap;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("ide",10);
        m.put("course",15);
        m.put("gfg",20);
        System.out.println(m);
        System.out.println(m.size());
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(m.containsKey("ide"));
        System.out.println(m.containsValue(15));
        System.out.println(m.get("course"));
        m.remove("ide");

        System.out.println(m.size());
        System.out.println(m.containsKey("ide"));
    }
}
