public class SumOfNaturalNumber {
    public static int naturalNumber(int n){
        if(n==0){
            return 0;
        }

        int naturalSum = naturalNumber(n-1);
        int sum = n + naturalSum;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(naturalNumber(n));
    }
}