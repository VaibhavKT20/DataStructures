public class GCDNaive {
    public static int gcd(int a,int b){
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0&&b%res==0){
                break;
            }
            res--;
        }
        return res;

    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result=gcd(a,b);
        System.out.println(result);
    }
}
