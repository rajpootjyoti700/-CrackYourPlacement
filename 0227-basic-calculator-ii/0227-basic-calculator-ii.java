class Solution {
    public int calculate(String s) {
        
       Stack<Integer> st=new Stack<>();
        int num=0;
        char operator='+';
        int n=s.length();
        for(int i=0;i<n;i++){
            char value=s.charAt(i);
            if(Character.isDigit(value)){
                num=(num*10)+(value-'0');
            }
            if((!Character.isDigit(value) && value!=' ') || i==n-1){
                if(operator=='+')
                    st.push(num);
                if(operator=='-')
                    st.push(-1*num);
                if(operator=='*')
                    st.push(st.pop()*num);
                if(operator=='/')
                    st.push(st.pop()/num);
                
                operator=value;
                num=0;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}