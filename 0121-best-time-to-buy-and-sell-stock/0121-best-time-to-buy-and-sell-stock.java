class Solution {
    public int maxProfit(int[] prices) {
    // so the main conditions are we need max profit i e. greedy
        // we have to buy 1st then sell 
        // nd the selling elemeny must be grter then the buying elemt
        int max=0;
        int n=prices.length;
         int buy=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
                if(prices[i]<=buy)
                    buy=prices[i];
                 if(prices[i]>buy){
                    profit=prices[i]-buy;
                   max= Math.max(profit,max);
                }
            }
        
        return max;
    }
    
}