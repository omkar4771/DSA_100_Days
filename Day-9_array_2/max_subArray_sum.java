public class max_subArray_sum {

    public static int sumArray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            int l=i;
            for(int j=i;j<numbers.length;j++){
                int r=j;
                int currentSum =0;
                for(int k=l;k<=r;k++){
                     currentSum  = currentSum +numbers[k];
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        int maxSum = sumArray(numbers);
        System.out.println(maxSum);
    }
}