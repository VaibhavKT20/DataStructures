public class SubArraySum {
//    public static boolean subArraySum(int []arr,int sum){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int curr=0;
//            for(int j=i;j<n;j++){
//                curr+=arr[j];
//                if(curr==sum){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //Optimal approach sliding window technique
    public static boolean subArraySum(int []arr,int sum){
        int n=arr.length;
        int s=0;
        int curr=0;
        for(int e=0;e<n;e++){
            curr+=arr[e];
            while(sum<curr){
                curr-=arr[s];
                s++;
            }
            if(curr==sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={1,4,20,3,10,5};
        boolean result=subArraySum(arr,33);
        System.out.println(result);
    }
}
