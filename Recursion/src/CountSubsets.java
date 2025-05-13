public class CountSubsets {
    public static int countSubset(int arr[],int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return countSubset(arr,n-1,sum)+countSubset(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int arr[]={10,5,2,3,6};
        int sum=8;
        int n=arr.length;
        int result=countSubset(arr,n,sum);
        System.out.println(result);
    }
}
