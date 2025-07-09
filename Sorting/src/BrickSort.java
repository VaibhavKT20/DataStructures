public class BrickSort {
    public static void brickSort(int []arr){
        int n=arr.length;
        boolean isSorted=false;
        while(!isSorted){
            boolean flag=false;
            for(int i=0;i<=n-2;i+=2){
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
            for(int i=1;i<=n-2;i+=2){
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                isSorted=true;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={2,7,1,5,0,1,12};
        brickSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
