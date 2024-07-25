class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
                mp.put(nums[i],1);
        }
        
        
        for(int i=0;i<n;i++){
            if(mp.get(nums[i])==2){
                set.add(nums[i]);
            }
        }
        
  for(int a: set){
      list.add(a);
  }
        return list;
    }
    
}