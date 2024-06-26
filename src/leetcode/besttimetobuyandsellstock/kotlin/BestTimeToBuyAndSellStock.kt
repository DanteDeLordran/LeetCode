package leetcode.besttimetobuyandsellstock.kotlin

/*
*
*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4] [7,6,4,3,1] [1,2]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
* */

class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var buy = prices[0]
        for (i in 1..<prices.size){
            if (prices[i] < buy){
                buy = prices[i]
            }else if (prices[i] - buy > profit){
                profit = prices[i] - buy
            }
        }
        return profit
    }
}