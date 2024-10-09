class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
               st.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                if(st.isEmpty() || st.peek()==')')
                    st.push(s.charAt(i));
                else{
                    if(st.peek()=='(')
                    st.pop();
                }
                
            }
                
        }
        return st.size();
    }
}