import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void countFrequency(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }
            int freq = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }

            System.out.println(arr[i]+" : "+freq);
        }
    }
    public static void countFrequency1(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
    public static void main(String[] args) {
        int []arr={10,12,10,15,10,20,12,12};
        countFrequency(arr);
        System.out.println("Efficient Approach");
        countFrequency1(arr);
    }
}

// Time Complexity : O(n*n)
// Auxiliary Space : O(1)
