class Solution {
    public boolean checkInclusion(String s1, String s2) {
    // the approach is we can sort our s1 and take the subset
//of size s1 in s2 i.e every subset and sort that part 
// and check if that part is equal to the s1 so return true.
        
      char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        String str1=String.valueOf(ch);
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<m-n+1;i++){
            
                String str=s2.substring(i,i+n);
                char[] ch1=str.toCharArray();
                Arrays.sort(ch1);
                String str2=String.valueOf(ch1);
                if(str1.equals(str2))
                    return true;
            
            
        }
        return false;
    }
}