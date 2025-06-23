public class FirstOccurrence {
    public static int firstOccurrence(int []arr,int low,int high,int target){
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
    public static void main(String[] args) {
        int []arr={5,10,10,20,20};
        int result=firstOccurrence(arr,0,arr.length-1,10);
        System.out.println(result);
    }
}
