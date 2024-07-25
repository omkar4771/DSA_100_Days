// package Day-6_function_and_method;

public class product {
    public static int multi(int a, int b){
        int prod = a*b;
        return prod;
    } 
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int n=7;

        int prod = multi(a,b);
        System.out.println(prod);
        int fact = factorial(n);
        System.out.println("Fcactrial of "+n+" is "+fact);
    }
}
