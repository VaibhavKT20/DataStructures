public class EquilibriumPoint {
    public static boolean equilibriumPoint(int []arr){
        int n=arr.length;
        int rs=0;
        for(int i=0;i<n;i++){
            rs+=arr[i];
        }
        int ls=0;
        for(int i=0;i<n;i++){
            rs-=arr[i];
            if(ls==rs){
                return true;
            }
            ls+=arr[i];
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={3,4,8,-9,9,7};
        boolean result=equilibriumPoint(arr);
        System.out.println(result);
    }
}
