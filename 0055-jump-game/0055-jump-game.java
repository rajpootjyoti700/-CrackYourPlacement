class Solution {
    public boolean canJump(int[] nums) {
  // the approch is we can start traversing from the end
        // and we  will the previous index +that element if greater 
        //than obiosly it will reach the next step becoz it is the largest
        // length
int target=nums.length-1;
    for(int i=nums.length-2;i>=0;i--){
        if(target<=i+nums[i])//means we can reach the target
            target=i;
            
    } 
      return target==0;  
        
    }
}