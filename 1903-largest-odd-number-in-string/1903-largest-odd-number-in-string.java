class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int i=n-1;
        if((num.charAt(i)-'0')%2!=0)
            return num;
        for(int j=n-2;j>=0;j--){
            if((num.charAt(j)-'0')%2!=0)
                return num.substring(0,j+1);
        }
        return "";
    }
}