class Solution {
    public int maxProfit(int[] prices) {
        // int buyPrice=prices[0];
        // int profit=0;
        // for(int i=1;i<prices.length;i++){
        //     if(buyPrice>prices[i]){
        //         buyPrice=prices[i];
        //     }
        //     profit=Math.max(profit,prices[i]-buyPrice);
        // }
        // return profit;
        int maxProfit=0, bestBuy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            }
           bestBuy=Math.min(bestBuy,prices[i]); 
        }
        return maxProfit;
        
    }
}