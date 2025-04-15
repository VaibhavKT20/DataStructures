public class FactorialRecursive {
    public static int factOfNum(int n){
        if(n==0){
            return 1;
        }
        return n*factOfNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int res=factOfNum(n);
        System.out.println(res);
    }
}
