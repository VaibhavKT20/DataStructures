public class LargestEl {
    public static int largestElementIndex(int []arr,int n){
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={10,30,4,19,22};
        int n=arr.length;
        int result=largestElementIndex(arr,n);
        System.out.println(result);
    }
}
