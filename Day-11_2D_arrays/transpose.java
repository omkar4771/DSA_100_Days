public class transpose {

    public static void main(String[] args) {
        int matrix [] [] = { { 1,2,3},{4,5,6}};
        int transpo[][] = new int [matrix[0].length] [matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpo[j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
               System.out.print(transpo[i][j] + " "); 
            }
            System.out.println();
        }
        
    }
}