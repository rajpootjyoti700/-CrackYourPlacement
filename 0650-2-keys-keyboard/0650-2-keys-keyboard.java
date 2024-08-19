class Solution {
    public int minSteps(int n) {
        int fac=2;
        int ans=0;
        while(n>1){
            while(n%fac==0){
                ans=ans+fac;
                n=n/fac;
            }
            fac++;
        }
        return ans;
    }
}