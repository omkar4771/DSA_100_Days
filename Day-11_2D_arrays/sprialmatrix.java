import java.util.ArrayList;
import java.util.List;

public class sprialmatrix {
    public static void printSprialMatrix(int matrix [][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol)
        {   //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
                
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> myList = new ArrayList<>();
        int startCol = 0;
        int endCol = matrix[0].length-1;
        int startRow = 0;
        int endRow = matrix.length-1;

        while(startCol<=endCol && startRow <=endRow){
            //top
            for(int j=startCol; j<=endCol;j++){
                myList.add(matrix[startRow][j]);
            }
            startRow++;
            //right
            for(int i=startRow+1;i<=endRow;i++){
                myList.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                myList.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startRow==endRow){
                    break;
                }
                myList.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        return myList;
    }
    public static void main(String[] args) {
        int matrix [][] = { {7},
                            {9},
                            {6}
                };
        printSprialMatrix(matrix);
        // List<Integer> myList = spiralOrder(matrix);
        // Print the result elements
        // for (int num : myList) {
            // System.out.print(num + " ");
        // }
    }
}
