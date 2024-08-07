public class Factorial {

    public static int  factorial(int n){
        if( n == 0){
            return 1 ; 
        }
       int fact  = factorial(n-1);
       int fn =  n* fact;
       return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}