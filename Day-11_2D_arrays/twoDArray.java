// package Day-11_2D_arrays;
import java.util.Scanner;
public class twoDArray {
    public static void matrix (int array[][])
    {
        int m= array.length;
        int n = array[0].length;
        //out put
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean search(int array[][], int key){
        int m = array.length;
        int n = array[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(key == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void largeAndSmallNumber (int array[][]){
        int m=array.length;
        int n=array[0].length;
        int largr = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(array[i][j] > largr)
                {
                    largr= array[i][j];
                }
                if(array[i][j] < small){
                    small = array[i][j];
                }
            }
        }
        System.out.println("large number in array is : "+largr);
        System.out.println("Small number in array is : "+small);
    }

    public static void main(String[] args) 
    {
        int array[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        // int m=2,n=2;
        int m= array.length;
        int n = array[0].length;
        //input
        System.out.println("Enter array : ");
        for(int i = 0; i < m; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                 array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Key which u want to find in array :");
        int key = sc.nextInt();
        matrix(array);
        System.out.println(search(array, key));
        largeAndSmallNumber(array);
    }
}
