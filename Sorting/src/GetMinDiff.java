public class GetMinDiff {
    public static int getMinDiff(int []arr){
        int n=arr.length;
        int res=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                res=Math.min(res,Math.abs(arr[i]-arr[j]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,8,12,5,18};
        int res=getMinDiff(arr);
        System.out.println(res);
    }
}
