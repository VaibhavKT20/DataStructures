public class LeftMostRepeating {
    public static int leftMostRepeating(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    return i;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        String str="abbccdd";
        int result=leftMostRepeating(str);
        System.out.println(result);
    }
}
