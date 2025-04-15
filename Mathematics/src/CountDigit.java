public class CountDigit {
    public static int countDigit(int x){
        int res=0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int x=3881;
        int res=countDigit(x);
        System.out.println(res);

    }
}
