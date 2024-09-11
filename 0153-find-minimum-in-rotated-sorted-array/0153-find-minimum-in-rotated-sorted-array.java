class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[s]<=nums[mid]){
                min=Math.min(nums[s],min);
                s=mid+1;
            }
            else{
                min=Math.min(nums[mid],min);
                e=mid-1;
            }
             
        }
            return min;
    }
}