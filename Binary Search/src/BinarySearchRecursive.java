public class BinarySearchRecursive {
    public static int binarySearchRecursive(int []arr,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target){
           return binarySearchRecursive(arr,low,mid-1,target);
        }
        else{
           return binarySearchRecursive(arr,mid+1,high,target);
        }
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60};
        int result=binarySearchRecursive(arr,0,arr.length-1,30);
        System.out.println(result);
    }
}
