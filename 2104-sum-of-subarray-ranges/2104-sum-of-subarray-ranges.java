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
    
     public static int[] getPlE(int[] arr, int n){
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty())
               result[i]=-1;
            else{
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
                st.pop();
            result[i]=st.isEmpty()?-1:st.peek();
        }
            st.push(i);
        }
        return result;
            
    }
    
    
    public static int[] getNlE(int[] arr, int n){
        int[] result=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty())
               result[i]=n;
            else{
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
                st.pop();
            result[i]=st.isEmpty()?n:st.peek();
        }
            st.push(i);
        }
        return result;
            
    }
    public long subArrayRanges(int[] nums) {
          int n=nums.length;
// the approch is we will find out the left array and the right array
//which will contain the previous smallest and the next smallest
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        
        int[] arr3=new int[n];
        int[] arr4=new int[n];
        arr1=getPSE(nums,n);
        arr2=getNSE(nums,n);
        
        arr3=getPlE(nums,n);
        arr4=getNlE(nums,n);
        long sum1=0;
        long sum2=0;
        int m=1000000007;
        for(int i=0;i<n;i++){
            long ll=i-arr1[i];
            long rl=arr2[i]-i;
            
            long l2=i-arr3[i];
            long r2=arr4[i]-i;
            long total1=ll*rl; // total subarray
             long total2=l2*r2; // total subarray
            long tsum1=nums[i]*total1;
            
             long tsum2=nums[i]*total2;
            sum1=(sum1+tsum1);
            sum2=(sum2+tsum2);
            
        }
        return sum2-sum1;
    }
}