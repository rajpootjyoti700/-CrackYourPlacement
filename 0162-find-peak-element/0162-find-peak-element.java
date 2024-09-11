class Solution {
    public int findPeakElement(int[] nums) {
        int strt=0;
        int end=nums.length-1;
        int mid=strt+(end-strt)/2;
        while(strt<end){
            mid=strt+(end-strt)/2;
            if(nums[mid]<=nums[mid+1]){
                strt=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}