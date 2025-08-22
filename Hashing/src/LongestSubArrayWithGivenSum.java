import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class LongestSubArrayWithGivenSum {
    public static int longestSubArrayWithGivenSum(int []arr,int sum){
        Map<Integer,Integer> m=new HashMap<>();
        int pre_sum=0;
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum){
                res=i+1;
            }
            if(m.containsKey(pre_sum)==false){
                m.put(pre_sum,i);
            }
            if(m.containsKey(pre_sum-sum)){
                res=Math.max(res,i-m.get(pre_sum-sum));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={5,8,-4,-4,9,-2,2};
        int sum=0;
        int res=longestSubArrayWithGivenSum(arr,sum);
        System.out.println(res);

    }
}
