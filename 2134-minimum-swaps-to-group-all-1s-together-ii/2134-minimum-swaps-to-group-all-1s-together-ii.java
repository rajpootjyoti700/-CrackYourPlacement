class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int total=0;
        // count total number of 1s
        for(int i=0;i<n;i++){
            if(nums[i]==1)
                total++;
        }
        //base case
        if(total==0 || total==n)
            return 0;
        //take a 1st window of size total 1 which contain current one 
        int curr=0;
        for(int i=0;i<total;i++){
            curr=curr+nums[i];
        }
        int max=curr;
        // now we will shift our window nd find max one's window
    for(int i=0;i<n;i++){
        curr=curr-nums[i];
        curr=curr+nums[(i+total)%n];
        max=Math.max(max,curr);
    }
        return total-max;
    }
}