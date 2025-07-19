public class Rotate90CounterClockwise {
    public static void print(int[][]mat){
        int r= mat.length;
        int c= mat[0].length;
        int [][]temp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[r-j-1][i]=mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=temp[i][j];
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
