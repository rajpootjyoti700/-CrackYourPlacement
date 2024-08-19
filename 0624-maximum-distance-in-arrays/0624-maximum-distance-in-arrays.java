class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int dis=0;
        for(int i=1;i<arrays.size();i++){
             dis=Math.max(dis,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min));
            dis=Math.max(dis,Math.abs(max-arrays.get(i).get(0)));
            min=Math.min(min,arrays.get(i).get(0));
            max=Math.max(max,arrays.get(i).get(arrays.get(i).size()-1));
        }
                         
      return dis;
    }
}