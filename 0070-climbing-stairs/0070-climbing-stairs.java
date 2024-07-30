class Solution {
    
    public int climbStairs(int n) {
        // using dp tle in recursion
        int[] f=new int[n+1];
        int ans=fun(n,f);
        return ans;
    }
    public int fun(int n,int[] f){
        if(n==0)
            return 1;
        if(n<1)
            return 0;
        if(f[n]!=0)
            return f[n];
        return f[n]=fun(n-1,f)+fun(n-2,f);
    }
}