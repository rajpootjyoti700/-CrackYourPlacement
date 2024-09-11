class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        char[] a=s.toCharArray();
        int n=a.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(a[i]=='('){
                count++;
            sb.append('(');
                }
            else{
                if(count==0)
                    i++;
                else{
                    sb.append(')');
                    count--;
                }
            }
        }
        return sb.toString();
    }
}