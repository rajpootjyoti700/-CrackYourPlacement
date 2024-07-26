class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
     // the approach is we will sort the string 
        // and compare the 1st and the last string becoz there is no need compare 
        // in between becoz it will automatically equal
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[n-1];
        int count=0;
        while(count<s1.length() && count<s2.length()){
            if(s1.charAt(count)==s2.charAt(count))
                count++;
            else
                break;
        }
        return s1.substring(0,count);
    }
}