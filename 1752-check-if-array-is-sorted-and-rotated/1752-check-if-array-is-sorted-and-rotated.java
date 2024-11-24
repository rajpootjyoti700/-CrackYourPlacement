class Solution {
    public boolean check(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                x=i+1;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[(i+x)%nums.length]>nums[((i+x+1)%nums.length)])
                return false;
        }
        return true;
    }
}