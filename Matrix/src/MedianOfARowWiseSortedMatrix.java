import java.util.Arrays;

public class MedianOfARowWiseSortedMatrix {
    public static int medianOfARowWiseSortedMatrix(int [][]mat){
        int r=mat.length;
        int c=mat[0].length;
        int arr[]=new int[r*c];
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[index++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int mid=(left+right)/2;
        return arr[mid];
    }
    public static void main(String[] args) {
        int [][]mat={{1,10,20},{15,25,35},{5,30,40}};
        int result=medianOfARowWiseSortedMatrix(mat);
        System.out.println(result);
    }
}
