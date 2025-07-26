public class CheckPalindrome {
//    public static boolean checkPalindrome(String str){
//        int start=0;
//        int end=str.length()-1;
//        while(start<end){
//            if(str.charAt(start)!=str.charAt(end)){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

    public static boolean checkPalindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public static void main(String[] args) {
        boolean result=checkPalindrome("NAMAN");
        System.out.println(result);
    }
}
