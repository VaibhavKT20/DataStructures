public class SquareRootFloor {
    public static int squareRootFloor(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int msq=mid*mid;
            if(msq==x){
                return mid;
            }
            else if(msq>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int num=10;
        int num=16;
        int result=squareRootFloor(num);
        System.out.println(result);
    }

}
