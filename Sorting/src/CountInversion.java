public class CountInversion {
    public static int countInversion(int []arr){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={2,4,1,3,5};
        int res=countInversion(arr);
        System.out.println(res);
    }
}
