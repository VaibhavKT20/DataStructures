public class FactorialIterative {
    public static int factOfNum(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int res=factOfNum(n);
        System.out.println(res);
    }
}
