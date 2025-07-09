public class BubbleSort {
    public static void bubbleSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={2,7,1,5,0,1,12};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
