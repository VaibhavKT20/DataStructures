public class Palindrome {
    public static boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        return rev==temp;

    }
    public static void main(String[] args) {
        int n=191;
        boolean res=isPalindrome(n);
        System.out.println(res);
    }
}
