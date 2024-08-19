class Solution {
    int ans=0;
    public int solve(int n ,int[] dp){
        if(n<=1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        for(int i=1;i<=n;i++){
            ans=ans+solve(i-1,dp)*solve(n-i,dp);
        }
        return dp[n]=ans;
    }
    public int numTrees(int n) {
        int[] dp=new int[n+1];
       return solve(n,dp);
    }
}