class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int m=(1<<n);
        for(int i=0;i<m;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0)
                    list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;
    }
}