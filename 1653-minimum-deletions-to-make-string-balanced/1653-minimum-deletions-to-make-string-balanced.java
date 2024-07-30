class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int count=0;
        if(n==1)
            return 0;
        
        while(l<n-1 && r<n){
            if(s.charAt(l)=='b'){
               
                while((s.charAt(r)!='a' || l>=r) && r<n-1){
                    r++;
                }
                
                count++;
                if(r==n-1 && s.charAt(r)!='a')
                    count--;
                r++;
                
            }
            
            l++;
                
        }
        return count;
    }
}