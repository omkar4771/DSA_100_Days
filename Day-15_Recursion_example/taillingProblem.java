public class taillingProblem {

    public static int taillingProb(int n){ //2 * n (floor size)

        //kaam
        if(n==0 || n==1){
            return 1;
        }

        // vertical 
        int vertical = taillingProb(n-1);

        //horizontal
        int horizontal = taillingProb(n-2);

        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(taillingProb(n));
    }
}