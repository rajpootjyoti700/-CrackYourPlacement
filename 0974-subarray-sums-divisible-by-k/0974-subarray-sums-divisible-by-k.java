class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        // the concept of this ques is we will store the rem and their freq in the 
        //map nd traverse the array if we find the same remender twice means \
        // high length - to the length of upto 1st remender then remaining subaray
        // definately divisible by k 
        
      int sum=0;
        int ans=0;
        int n=nums.length;
        int rem=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            rem=sum%k;
            if(rem<0)
                rem=rem+k;
            if(mp.containsKey(rem)){
                ans=ans+mp.get(rem);
                mp.put(rem,mp.get(rem)+1);
            }
            else
                mp.put(rem,1);
        }
        return ans;
    }
}