class Solution {
    public int maxProfit(int[] prices) {
        // there is little diffrence in this ques from the previus question
        // as we can buy and sell in multiple days 
        //nd the same day when we will buy we can sell also;
        
        int start=prices[0];
        int n=prices.length;
        int max=0;
        for(int i=1;i<n;i++){
            if(start<prices[i])
                max=max+prices[i]-start;
            start=prices[i];
        }
        return max;
    }
}