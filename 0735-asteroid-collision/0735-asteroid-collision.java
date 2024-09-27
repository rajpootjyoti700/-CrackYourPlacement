class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0)
                st.push(asteroids[i]);
            else{
           while(!st.isEmpty() && st.peek()>0 &&  Math.abs(asteroids[i])>Math.abs(st.peek()))
               st.pop();
            
            if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                st.pop();
                continue;
            }
                 if(!st.isEmpty() && st.peek()>0 && st.peek()>Math.abs(asteroids[i])){
                continue;
            }
            
            if(st.isEmpty() || asteroids[i]<0)
                st.push(asteroids[i]);
            }
            
        }
        int m=st.size();
        int[] arr=new int[m];
        int  j=m-1;
        while(!st.isEmpty()){
            arr[j]=st.pop();
            j--;
        }
        return arr;
    }
}