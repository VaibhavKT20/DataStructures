import java.util.HashSet;

public class CountDistinct {
    public static int countDistinct(int []arr){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);

        }
        return s.size();
    }
    public static void main(String[] args) {
        int []arr={10,20,20,20,30,10,40,50,60,60,60};
        int res=countDistinct(arr);
        System.out.println(res);
    }
}
