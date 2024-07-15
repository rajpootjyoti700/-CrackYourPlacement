class Solution {
    public void sortColors(int[] nums) {
        int k=0;
        int n=nums.length;
        int[] arr=new int[n];
       for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
               arr[k]=0;
               k++;
           }
           
       }
        
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
               arr[k]=1;
               k++;
           }
           
       }
        
        for(int i=0;i<nums.length;i++){
           if(nums[i]==2){
               arr[k]=2;
               k++;
           }
           
       }
        
        for(int i=0;i<nums.length;i++){
           nums[i]=arr[i];
       }
    }
}