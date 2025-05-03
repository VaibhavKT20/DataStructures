public class PowerOfTwo {
//    public static boolean powerOfTwo(int n){
//        if(n==0){
//            return false;
//        }
//        while(n!=1){
//            if(n%2!=0){
//                return false;
//            }
//            n=n/2;
//        }
//        return true;
//    }

    //Optimal Approach

    public static boolean powerOfTwo(int n){
        if(n==0){
            return false;
        }
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        int n=8;
        boolean res=powerOfTwo(n);
        System.out.println(res);
    }
}
