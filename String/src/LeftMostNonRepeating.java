public class LeftMostNonRepeating {
    public static int leftMostNonRepeating(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int res=leftMostNonRepeating(str);
        System.out.println(res);
    }
}
