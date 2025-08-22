import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
    public static boolean subArraywithGivenSum(int []arr,int sum){
        Set<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(pre_sum==sum) return true;
            if(h.contains(pre_sum-sum)){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={5,8,6,13,3,-1};
        int sum=22;
        boolean res=subArraywithGivenSum(arr,sum);
        System.out.println(res);
    }
}
