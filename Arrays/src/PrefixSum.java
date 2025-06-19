public class PrefixSum {
    public static int prefixSum(int []arr ,int l,int r){
        int n=arr.length;
        int res=0;
        for(int i=l;i<=r;i++){
            res+=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={2,8,3,9,6,5,4};
        int result=prefixSum(arr,1,3);
        System.out.println(result);
    }
}
