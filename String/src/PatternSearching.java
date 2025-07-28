public class PatternSearching {
    public static int patternSearch(String str,String pat){
        int n=str.length();
        int m=pat.length();
        for(int i=0;i<n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j)!=str.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String pat="eks";
        int res=patternSearch(str,pat);
        System.out.println(res);
    }
}
