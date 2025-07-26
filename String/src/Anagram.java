import java.util.Arrays;

public class Anagram {
//    public static boolean checkAnagram(String s1,String s2){
//        int n=s1.length();
//        int m=s2.length();
//        if(n!=m){
//            return false;
//        }
//        char []a1=s1.toCharArray();
//        char []a2=s2.toCharArray();
//        Arrays.sort(a1);
//        Arrays.sort(a2);
//        s1=new String(a1);
//        s2=new String(a2);
//        return s1.equals(s2);
//    }

    static final int CHAR=256;
    public static boolean checkAnagram(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        if(n!=m){
            return false;
        }
        int []count=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        boolean result=checkAnagram(s1,s2);
        System.out.println(result);
    }
}
