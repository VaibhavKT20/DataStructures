public class TransposeOfAMatrix {
    public static void print(int [][]matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        int [][]temp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=temp[i][j];
            }
        }
        System.out.println("Transposed Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r=matrix.length;
        int c=matrix[0].length;
        System.out.println("Original Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        print(matrix);
    }
}
