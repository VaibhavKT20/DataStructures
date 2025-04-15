public class GCDOptimized {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result=gcd(a,b);
        System.out.println(result);
    }

}
