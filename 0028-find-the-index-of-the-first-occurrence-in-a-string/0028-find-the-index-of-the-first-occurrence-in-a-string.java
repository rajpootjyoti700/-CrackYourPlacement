class Solution {
    public int strStr(String haystack, String needle) {
       // it will go in order on n square
        // we have to find out the needle substring  in haystack string 
        // so we will use the while loop for the substring 
        
        int n=haystack.length();
        int m=needle.length();
        // base case also
        if(n<m)
            return -1;
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            
            if(j==m)
                return i;
        }
        return -1;
    }
}