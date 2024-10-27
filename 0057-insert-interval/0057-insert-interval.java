class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        //1stly we have to seprate left part which is not overlap
        //then combine the overlap part
        //then we have to seprate the right part
        
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
             i++;
        }
        list.add(newInterval);
        while(i<n){
            list.add(intervals[i]);
            i++;
        }
        int[][] arr=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
            arr[k][0]=list.get(k)[0];
            arr[k][1]=list.get(k)[1];
        }
        return arr;
    }
}