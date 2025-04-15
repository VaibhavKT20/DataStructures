public class LCM {
    public static int lcm(int a,int b){
        int res=Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }

    }
    public static void main(String[] args) {
        int a=4;
        int b=6;
        int result=lcm(a,b);
        System.out.println(result);
    }
}
