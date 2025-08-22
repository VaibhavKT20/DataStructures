import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class CountUnion {
    public static int countUnion(int []a,int []b){
        Set<Integer> h=new HashSet<>();
        for(int x:a){
            h.add(x);

        }
        for(int x:b){
            h.add(x);
        }
        return h.size();
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,10};
        int []b={40,10,50};
        int res=countUnion(a,b);
        System.out.println(res);
    }
}
