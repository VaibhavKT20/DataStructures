public class CountOccurrence {
    public static int firstOccurrence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                if(arr[mid]==0||arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static int lastOccurrence(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                if(arr[mid]==0||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static int countOccurrences(int[] arr, int x) {
        int first = firstOccurrence(arr, x);
        if (first == -1) {
            return 0;
        }
        int last = lastOccurrence(arr, x);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        int count = countOccurrences(arr, x);
        System.out.println("Count of " + x + " is: " + count);
    }
}
