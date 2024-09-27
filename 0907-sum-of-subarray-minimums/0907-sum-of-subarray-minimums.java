class Solution {
    public static int[] getPSE(int[] arr, int n){
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty())
               result[i]=-1;
            else{
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            result[i]=st.isEmpty()?-1:st.peek();
        }
            st.push(i);
        }
        return result;
            
    }
    
    public static int[] getNSE(int[] arr, int n){
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty())
               result[i]=n;
            else{
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
                st.pop();
            result[i]=st.isEmpty()?n:st.peek();
        }
            st.push(i);
        }
        return result;
            
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
// the approch is we will find out the left array and the right array
//which will contain the previous smallest and the next smallest
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1=getPSE(arr,n);
        arr2=getNSE(arr,n);
        long sum=0;
        int m=1000000007;
        for(int i=0;i<n;i++){
            long ll=i-arr1[i];
            long rl=arr2[i]-i;
            long total=ll*rl; // total subarray
            long tsum=arr[i]*total;
            sum=(sum+tsum)%(long)m;
            
        }
        return (int)sum;
    }
}