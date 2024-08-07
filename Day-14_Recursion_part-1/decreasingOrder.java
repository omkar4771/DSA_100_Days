// print number from n to 1 (Decresing Ordder) & 1 to n (incrising order)
public class decreasingOrder {
    public static void desreasing(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        desreasing(n-1);
    }
    
    public static void increasing (int n){
        if (0 == n ) {
            return;
        }
        increasing(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10 ;
        desreasing(n);
        increasing(n);
    }
}