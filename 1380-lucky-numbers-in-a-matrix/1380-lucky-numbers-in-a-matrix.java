class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        // approach is 1st we will find the min in a row 
        // then trvese that column if we find any of the elt 
        //which is greater than that element then flag will false 
        // as that min is actuualy the maximum in that column
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            
            boolean flag=true;
            for(int r=0;r<m;r++){
                if(matrix[r][index]>min)
                    flag=false;
            }
            
             if(flag)
        list.add(min);
        }
        return list;
    }
}