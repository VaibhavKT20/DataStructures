public class ReverseByN {
    public static String reverse(String str, int k){
        char []charArr=str.toCharArray();
        int n=charArr.length;
        char []rotated=new char[n];

        for(int i=0;i<n;i++){
            rotated[i]=charArr[(i+k)%n];
        }
        return new String(rotated);
    }

    public static void main(String[] args) {
        String str="jithin";
        int n=2;
        String res=reverse(str,n);
        System.out.println(res);
    }
}
