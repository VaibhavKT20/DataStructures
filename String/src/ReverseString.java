public class ReverseString {
    public static void reverseString(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            ans=str.charAt(i)+ans;
        }
        System.out.println(ans);
    }

    //Other Approach
    public static void reverseString1(String str){
        int n=str.length();
        char []charArr=str.toCharArray();
        int i=0;
        int j=charArr.length-1;
        while(i<j){
            char temp=charArr[i];
            charArr[i]=charArr[j];
            charArr[j]=temp;
            i++;
            j--;

        }
        System.out.println(new String(charArr));
    }
    public static void main(String[] args) {
        reverseString("ABCD");
        reverseString1("ABCD");
    }
}
