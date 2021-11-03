package com.company.array;

public class BestTimeToBuyAndSellStock_R {

    // your solution is pretty much same as the answer but slightly different, review the answer




















    public int maxProfit(int[] prices) {

        int maxPrice = 0;
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            int curr = prices[i];

            if (curr > maxPrice)
                maxPrice = curr;

            int profit = maxPrice - curr;

            if (profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
    }
}
