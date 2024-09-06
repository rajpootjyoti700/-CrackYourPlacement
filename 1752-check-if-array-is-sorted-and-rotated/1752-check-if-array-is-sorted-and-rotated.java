class Solution {
    public boolean check(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                index=i+1;
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[(i+index)%nums.length];
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }
}