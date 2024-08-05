class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
               mp.put(arr[i],mp.get(arr[i])+1); 
            }
            else{
                mp.put(arr[i],1);
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
          if(mp.get(arr[i])==1)
              count++;
            if(count==k)
                return arr[i];
        }
        return "";    
    }
}