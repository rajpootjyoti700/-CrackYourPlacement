class Solution {
    public int findComplement(int num) {
        String str=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1')
                ans=ans+'0';
            else
                ans=ans+'1';
        }
        return Integer.parseInt(ans,2);
        
    }
}