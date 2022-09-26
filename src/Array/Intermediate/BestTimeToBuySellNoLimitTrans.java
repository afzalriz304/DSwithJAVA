package Array.Intermediate;

public class BestTimeToBuySellNoLimitTrans {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int maxProfit=0;
        int bp = prices[0];
        int currentProfit;
        for(int i =0;i<prices.length;i++){
            currentProfit=prices[i]-bp;
            if(currentProfit>0){
                maxProfit+=currentProfit;
            }
            bp=prices[i];
        }
        return maxProfit;
    }
}
