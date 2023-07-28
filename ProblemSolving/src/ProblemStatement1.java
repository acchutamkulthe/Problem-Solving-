/*Find maximum profit earned by buying and selling shares any number of times
        Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint, a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
        For example:
        Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}

        Total profit earned is 10

        Buy on day 1 and sell on day 2
        Buy on day 3 and sell on day 5
        Buy on day 7 and sell on day 8


        Stock Prices: {10, 8, 6, 5, 4, 2}

        Total profit earned is 0*/

public class ProblemStatement1 {
    public static int maxProfit(int[] prices ){
        int profit=0,low,high,j=0;
        for (int i = 0; i < prices.length-1; i++) {
            while(i< prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            low=prices[i];
            while (i<prices.length-1 && prices[i]<prices[i+1]){
                i++;
            }
            high=prices[i];
            profit+= high-low ;
        }
        return profit;
    }


    public static void main(String[] args) {
    int arr[] = {1, 5, 2, 3, 7, 6, 4, 5};
        System.out.println(maxProfit(arr));
    }

}
