class Solution {
    public int maxProfit(int[] prices) {       
    //    int maxProfit=0, bestBuy=prices[0];
    //     for(int i=0;i<prices.length;i++){
    //         if(prices[i]>bestBuy){
    //             maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
    //         }
    //        bestBuy=Math.min(bestBuy,prices[i]); 
    //     }
    //     return maxProfit;

        int maxprofit=0,bestbuy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestbuy){
                maxprofit=Math.max(maxprofit,prices[i]-bestbuy);
            }else{
                bestbuy=Math.min(bestbuy,prices[i]);
            }
        }
        return maxprofit;

        
    }
}