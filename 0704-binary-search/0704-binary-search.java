class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target)
                return mid;
            if(target<=nums[mid]){
                e=mid-1;
            }
            if(target>nums[mid]){
                s=mid+1;
            }
        }
        return -1;
    }
}