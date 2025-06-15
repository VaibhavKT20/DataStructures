public class ReverseAnArray {
    public static int[] reverse(int []arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={10,5,7,30,40};
        int []result=reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
