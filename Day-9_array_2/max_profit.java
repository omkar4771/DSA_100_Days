// package Day-9_array_2;
// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
// Return the maximum profit you can achieve from this transaction. 
// If you cannot achieve any profit, return 0.

public class max_profit {
    public static int maxProfit(int profit[]){
       int  maxProfit =0;
        for(int i=0;i<profit.length;i++){
            for(int j=i+1;j<profit.length;j++){
                int p = profit[j]-profit[i];
                if(maxProfit < p){
                    maxProfit = p;
                }
            }
        }
        return maxProfit;
    }
    public static int maxProfit1(int profit[]){
        int max_profit = 0;
        int minPrice = profit[0] ;

        for(int i=0;i<profit.length;i++)
        {
           int p = profit[i]-minPrice;
           if(max_profit<p){
            max_profit = p;
           }
           if(profit[i]<minPrice){
            minPrice = profit[i];
           }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int profit[] = {7,1,5,3,6,4};
        int maxProfit = maxProfit(profit);
        System.out.println("Max profit = "+maxProfit);

        int maxProfit1 = maxProfit1(profit);
        System.out.println("Max profit = "+maxProfit1);
    }
}
