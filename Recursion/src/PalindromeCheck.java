public class PalindromeCheck {
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end) && isPalindrome(str,start+1,end-1));
    }
    public static void main(String[] args) {
        String str="bananab";
        int n=str.length();
        int start=0;
        int end=n-1;
        boolean result=isPalindrome(str,start,end);
        System.out.println(result);

    }
}
