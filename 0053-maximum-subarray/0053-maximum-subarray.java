class Solution {
    public int maxSubArray(int[] nums) {
        // FIND largest subarray sum
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
            
            
        }
        return max;
    }
}