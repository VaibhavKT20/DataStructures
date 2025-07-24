public class SearchInAMatrix {
    public static void searchInAMatrix(int [][]mat,int x){
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==x){
                    System.out.println(x+" Found at index ("+i+","+j+")");
                }
            }
        }

    }
    public static void main(String[] args) {
        int [][]mat={{10,20,30,40},{15,25,35,45},{19,29,39,49},{48,46,44,42}};
        System.out.println("Original Matrix");
        int x=29;
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        searchInAMatrix(mat,x);
    }
}
