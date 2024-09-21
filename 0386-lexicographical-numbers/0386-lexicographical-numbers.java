class Solution {
     ArrayList<Integer> list=new ArrayList<>();
    public void dfs(int x,int n){
        if(x>n)
            return;
        list.add(x);
        x=x*10;
        for(int j=0;j<10;j++){
            dfs(x+j,n);
        }
    }
    public List<Integer> lexicalOrder(int n) {
       
        for(int i=1;i<10;i++){
            dfs(i,n);
        }
        return list;
    }
}