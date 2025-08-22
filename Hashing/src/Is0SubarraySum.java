import java.util.HashSet;

public class Is0SubarraySum {
    public static boolean is0SubarraySum(int []arr){
        HashSet<Integer> h=new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(h.contains(pre_sum)){
                return true;
            }
            if(pre_sum==0){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={-3,4,-3,-1,1};
        boolean res=is0SubarraySum(arr);
        System.out.println(res);
    }
}
