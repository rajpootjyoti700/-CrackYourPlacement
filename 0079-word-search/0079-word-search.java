class Solution {
    public boolean dfs(char[][] board,int i,int j,String word,int idx)
    {
        if(idx>=word.length())
            return true;
        
        char orgchar = board[i][j];
        board[i][j]='1';
        
        int x[] = {0,-1,0,1};
        int y[] = {-1,0,1,0};
        
        for(int d=0;d<4;d++)
        {
            int nx = i + x[d];
            int ny = j + y[d];
            
            if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length && board[nx][ny]!='1' && word.charAt(idx)==board[nx][ny])
            {
                if(dfs(board,nx,ny,word,idx+1))
                    return true;
            }
        }
        
        board[i][j]=orgchar;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(board,i,j,word,1))
                        return true;
                }
            }
        }
        return false;
    }
}