public class SelectionSort {
    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minEl=arr[i];
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<minEl){
                    minEl=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr={2,7,1,5,0,1,12};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
