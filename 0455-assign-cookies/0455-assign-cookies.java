class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int l=0;
        int r=0;
        int count=0;
        
        while(r<m && l<n){
            if(s[r]>=g[l]){
                count++;
                l++;
                r++;    
            }
            else
                r++;
        }
        return count;
    }
}