import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSubsequence(int []arr){
        int n=arr.length;
        Set<Integer> h=new HashSet<>();
        for(int x:arr){
            h.add(x);
        }
        int res=1;
        for(Integer x:arr){
            if(h.contains(x-1)==false){
                int curr=1;
                while(h.contains(x+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,9,3,4,2,20};
        int res=longestConsecutiveSubsequence(arr);
        System.out.println(res);
    }
}
