public class SumofDigits {
    public static int getSum(int n){
        if(n<=9){
            return n;
        }
        return getSum(n/10)+n%10;
    }
    public static void main(String[] args) {
        int n=253;
        int result=getSum(n);
        System.out.println(result);
    }
}
