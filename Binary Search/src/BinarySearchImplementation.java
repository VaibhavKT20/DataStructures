public class BinarySearchImplementation {
    public static int binarySearch(int []arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,60,70}; //only for sorted array
        System.out.println(binarySearch(arr,50));

    }
}
