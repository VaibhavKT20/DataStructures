public class LeftMostRepeating {
//    public static int leftMostRepeating(String str){
//        int n=str.length();
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    return i;
//                }
//            }
//
//        }
//        return -1;
//    }

    static final int CHAR=256;
    public static int leftMostRepeating(String str){
        boolean []visited=new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                res=i;
            }
            else{
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="abbccdd";
        int result=leftMostRepeating(str);
        System.out.println(result);
    }
}
