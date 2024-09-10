class Solution {
    public int leftmost(int[] nums,int target,int n){
        int s=0;
        int e=n-1;
        int left=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                left=mid;
                e=mid-1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return left;
    }
    
    
     public int rightmost(int[] nums,int target,int n){
        int s=0;
        int e=n-1;
        int right=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                right=mid;
                s=mid+1;;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int left=-1;
        int right=-1;
        int n=nums.length;
        left=leftmost(nums,target,n);
        right=rightmost(nums,target,n);
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
}