public class SecondLargest {
    public static int secondLargestIndex(int [] arr, int n){
        int res=-1;
        int largest=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,11,234};
        int n=arr.length;
        int result=secondLargestIndex(arr,n);
        System.out.println(result);
    }
}
