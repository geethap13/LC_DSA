class Solution {
    public int maxProfit(int[] prices) {
         int min = Integer.MAX_VALUE;
        int n = prices.length;
        int profit = 0;
        int left = 0;
        for(int right = 1;right<n;right++){
            if(prices[left] < prices[right]){
                profit = Math.max(profit,prices[right] - prices[left]);
            }
            else{
                left = right;
            }
        }
        return profit;
    }
}