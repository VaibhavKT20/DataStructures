public class RotateLeftByD {
    public static void rotateLeftByD(int[] arr,int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int d=2;
        rotateLeftByD(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
