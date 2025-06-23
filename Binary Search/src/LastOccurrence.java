public class LastOccurrence {
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
    public static void main(String[] args) {
        int []arr={5,10,10,10,10,20,20};
        int result= lastOccurrence(arr,10);
        System.out.println(result);
    }
}
