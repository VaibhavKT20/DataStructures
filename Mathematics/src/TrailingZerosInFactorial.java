public class TrailingZerosInFactorial {
    public static int trailingZeros(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=251;
        int res=trailingZeros(n);
        System.out.println(res);
    }
}
