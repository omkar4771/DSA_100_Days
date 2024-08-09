public class climbingStairs {

    public static int climbStairs(int n){
        if(n==0 || n==1){
            return n;
        }

        int stair1 = climbStairs(n-1);
        int stair2 = climbStairs(n-2);
        int result = stair1 + stair2 ;

        return result;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbStairs(n));
    }
}