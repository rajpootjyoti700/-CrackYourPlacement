class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++){
           String s=details[i].substring(11,13);
            int a=Integer.parseInt(s);
            if(a>60)
                count++;
            
        }
        return count;
    }
}