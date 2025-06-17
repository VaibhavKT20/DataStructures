public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int []arr){
        int n=arr.length;
        int curr=0,res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(res,curr);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={0,1,1,0,1,1,1};
        int result=maxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
