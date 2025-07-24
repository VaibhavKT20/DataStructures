public class SearchInASortedMat {
    public static void searchInASortedMat(int [][]mat,int x){
        int r=mat.length;
        int c=mat[0].length;
        int i=0;
        int j=c-1;
        while (i<r && j>=0){
            if(mat[i][j]==x){
                System.out.println(x+" Found at index ("+i+","+j+")");
                return;
            }
            else if(mat[i][j]>x){
                j--;
            }
            else{
                i++;
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
        searchInASortedMat(mat,x);
    }
}
