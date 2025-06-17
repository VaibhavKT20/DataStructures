public class MaxSumSubArray {
    public static int maxSumSubArray(int arr[]){
        int res=arr[0];
        int maxEnding=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={-3,8,-2,4,-5,6};
        int result=maxSumSubArray(arr);
        System.out.println(result);
    }
}
