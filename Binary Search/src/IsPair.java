public class IsPair {
    public static boolean isPair(int []arr,int x){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if((arr[i]+arr[j])==x){
                return true;
            }
            else if((arr[i]+arr[j])<x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr={2,5,8,12,30};
        boolean result=isPair(arr,17);
        System.out.println(result);
    }
}
