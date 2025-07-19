public class Rotate90CounterClockwise {
    public static void swap1(int [][]mat,int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
    public static void swap2(int [][]mat,int high,int low,int i){
        int temp=mat[low][i];
        mat[low][i]=mat[high][i];
        mat[high][i]=temp;
    }
    public static void print(int[][]mat){
        int r= mat.length;
        int c= mat[0].length;
//        int [][]temp=new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                temp[r-j-1][i]=mat[i][j];
//            }
//        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                mat[i][j]=temp[i][j];
//            }
//        }

//        Optimal Approach
//        Transpose
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                swap1(mat,i,j);
            }
        }

//        Reverse
        for(int i=0;i<c;i++){
            int low=0;
            int high=c-1;
            while(low<high){
                swap2(mat,low,high,i);
                low++;
                high--;
            }
        }

        System.out.println("Rotated Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r= mat.length;
        int c= mat[0].length;
        System.out.println("Original Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        print(mat);
    }
}
