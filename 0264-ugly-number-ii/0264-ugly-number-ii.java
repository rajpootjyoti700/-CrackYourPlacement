class Solution {
    public int nthUglyNumber(int n) {
        int[] num=new int[1690];
        int ugly=0;
        int c1=0;
        int c2=0;
        int c3=0;
        num[0]=1;
        for(int i=1;i<1690;i++){
            num[i]=Math.min(Math.min(2*num[c1],3*num[c2]),5*num[c3]);
            ugly=num[i];
            
            if(2*num[c1]==ugly)
                c1++;
            if(3*num[c2]==ugly)
                c2++;
            if(5*num[c3]==ugly)
                c3++;
            }
        return num[n-1];
    }
}