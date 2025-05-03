public class CountSetBit {
//    public static int countSetBit(int n){
//        int res=0;
//        while(n>0){
//            if(n%2==1){
//                res++;
//            }
//            n=n/2;
//        }
//        return res;
//    }

        //Brain Kerningam's Algorithm
        public static int countSetBit(int n){
            int res=0;
            while(n>0){
                n=n&(n-1);
                res=res+1;
            }
            return res;
        }
    public static void main(String[] args) {
        int n=5;
        int result=countSetBit(n);
        System.out.println(result);
    }
}
