public class MoveAllZerosToEnd {
    public static int moveAllZerosToEnd(int []arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr={10,8,0,0,12,0};
        moveAllZerosToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
