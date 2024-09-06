class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int x=n-k;
    
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[(i+x)%n];
          }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        
    }
    }