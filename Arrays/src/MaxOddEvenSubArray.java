public class MaxOddEvenSubArray {
    public static int maxOddEvenSubArray(int []arr){
        int n=arr.length;
        int res=1;
        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=i+1;j<n;j++){
                if((arr[j]%2==0 &&arr[j-1]%2!=0)|| (arr[j]%2!=0 &&arr[j-1]%2==0)){
                    curr++;
                }
                else{
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={5,10,20,6,3,8};
        int result=maxOddEvenSubArray(arr);
        System.out.println(result);
    }
}
