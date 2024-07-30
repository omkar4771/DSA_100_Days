// package Day-9_array_2;

public class kadanes_alorithm {
    public static int kadanes(int [] numbers){
       int  maxSum = Integer.MIN_VALUE;
       int currentSum = 0;

       for(int i=0;i<numbers.length;i++)
        {
            currentSum = currentSum + numbers[i];
            if(currentSum<0){
                currentSum = 0;
            }
            if(currentSum >maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {-3};
        int maxSum = kadanes(numbers);
        System.out.println(maxSum);
    }
}
