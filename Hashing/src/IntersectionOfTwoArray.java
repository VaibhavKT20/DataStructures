import java.util.HashSet;

public class IntersectionOfTwoArray {
//    public static void intersectionOfTwoArray(int []a,int []b){
//        int m=a.length;
//        int n=b.length;
//        for(int i=0;i<m;i++){
//            boolean flag=false;
//            for(int j=0;j<n;j++){
//                if(a[i]==b[j]){
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag==true){
//                System.out.print(a[i]+" ");
//            }
//        }
//    }

    public static void intersectionOfTwoArray(int []a,int []b){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        for(int i=0;i<a.length;i++){
            if(s.contains(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int []a={10,15,20,25,30,50};
        int []b={30,5,15,80};
        intersectionOfTwoArray(a,b);
    }
}
