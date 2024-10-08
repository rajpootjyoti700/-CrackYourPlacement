class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='[')
                st.push(s.charAt(i));
            else if(s.charAt(i)==']'){
                if(!st.isEmpty() && st.peek()=='[')
                    st.pop();
            }
        }
        int m=st.size();
        if(m==0)
            return 0;
        return (m+1)/2;
    }
}