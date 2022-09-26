package Array.Basic;

public class BesTimeToBuySellOneTransaction {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length == 0)
            return maxProfit;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            }
        }
        return maxProfit;
    }
}
