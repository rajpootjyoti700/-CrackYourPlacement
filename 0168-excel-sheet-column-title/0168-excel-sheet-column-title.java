class Solution {
    public String convertToTitle(int columnNumber) {
        String s=""; 
        int i = columnNumber ;

        while(i >= 1)
        {
            i--;
            s = (char)(i % 26 + 65) + s;
            i = i / 26;
        }
        return s;	   
    }
}