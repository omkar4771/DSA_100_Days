public class fibonacci {

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int num2 = fib(n-1);
        int num3 = fib(n-2);
        int result = num2+num3 ;
        return result;
    }
    public static void main(String[] args) {
        int n=3;

        System.out.println(fib(n));
    }
}