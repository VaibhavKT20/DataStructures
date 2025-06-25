public class RepeatingElement {
    public static int repeatingElement(int []arr){
        int n=arr.length;
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[arr[i]]){
                return arr[i];
            }
            visited[arr[i]]=true;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={0,2,1,3,5,4,6,6};
        int result=repeatingElement(arr);
        System.out.println(result);
    }
}
