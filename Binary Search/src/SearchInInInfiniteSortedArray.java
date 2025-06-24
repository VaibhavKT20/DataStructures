public class SearchInInInfiniteSortedArray {
    public static int binarySearch(int []arr,int low,int high,int x){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int searchInInInfiniteSortedArray(int []arr,int x){
        if(arr[0]==x) return 0;
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x) return i;
        return binarySearch(arr,i/2+1,i-1,x);

    }
    public static void main(String[] args) {
        int []arr = {
                    1, 3, 5, 7, 9, 10, 13, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60,
                    65, 70, 75, 80, 85, 90, 95, 100, 110, 120, 130, 140, 150, 160, 170,
                    180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300,
                    310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440,
                    450, 460, 470, 480, 490, 500
            };
        int result=searchInInInfiniteSortedArray(arr,410);
        System.out.println(result);
    }
}
