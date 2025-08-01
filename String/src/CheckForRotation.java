public class CheckForRotation {
    public static boolean checkForRotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return ((s1+s2).indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="CDBA";
        boolean res=checkForRotation(s1,s2);
        System.out.println(res);
    }
}
