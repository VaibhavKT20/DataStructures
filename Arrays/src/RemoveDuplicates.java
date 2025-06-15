public class RemoveDuplicates {
    public static int removeDup(int []arr){
        int n=arr.length;
        int res=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={10,20,20,30,30,30,30};
        int result=removeDup(arr);
        for(int i=0;i<result;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
