public class power {
    public static int powerOfNum(int x,int n){
        if(n==1){
            return x;
        }
        return x * powerOfNum(x, n-1);
    }
    public static int optimizeapower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizeapower(x, n/2);
        int halfpowerSqure = halfpower * halfpower;

        //n is odd
        if(n%2 != 0){
            halfpowerSqure  = x* halfpowerSqure;
        }
        return halfpowerSqure;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(powerOfNum(x,n));
        System.out.println(optimizeapower(x,n));
    }
}