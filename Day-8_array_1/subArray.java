public class subArray {
    public static void printSubArray(int numbers[]){

        for(int i=0; i<numbers.length;i++){
            int l=i;
            for(int j=i;j<numbers.length;j++){
                int r=j;
                System.out.print("(");
                for(int k=l;k<=r;k++){
                    
                    System.out.print(numbers[k]+" ");
                    
                }
                System.out.print(")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        printSubArray(numbers);
    }
}
