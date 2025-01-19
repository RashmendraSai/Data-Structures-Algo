package org.coding.Blind75;

//LInk : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/*Example 1:
Input: prices = [7,1,5,3,6,4] ; Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Example 2:
Input: prices = [7,6,4,3,1] ; Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.*/
public class BuySellStockMaxProfit {
    public static void main(String[] args) throws IOException {
        int prices [] = {7,1,5,3,6,4};
        System.out.println("Max Profit :"+maxProfit(prices));
    }

    private static int maxProfit(int[] prices){
        int profit = 0;
        int minBuy = Integer.MAX_VALUE;
        for(int i =1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                minBuy = Math.min(minBuy,prices[i-1]);
                int maxSell = Math.max(prices[i], prices[i-1]);
                profit= Math.max(maxSell-minBuy,profit);
            }
        }
        return profit;
    }
}
