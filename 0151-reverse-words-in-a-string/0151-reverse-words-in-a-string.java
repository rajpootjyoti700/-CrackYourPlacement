class Solution {
    public String reverseWords(String s) {
      // reverse the word the approach is by taking substring
        int i=s.length()-1;
        String ans="";
        while(i>=0){
            // remove the trailing space
            while(i>=0 && s.charAt(i)==' ')
                i--;
            if(i<0)
                break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            if(ans==""){
                ans=ans+s.substring(i+1,j+1);
                
            }
            else{
                ans=ans+' '+s.substring(i+1,j+1);
            }
        }
        return ans;
    }
}