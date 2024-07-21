class Solution {
    public boolean doesAliceWin(String s) {
        int l=0;
        int r=s.length();
        int ans=0;
        int c=0;
        for(int i=0;i<r;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
                c++;
        }
        if(c==0)
            return false;
        else
            return true;
    }
}