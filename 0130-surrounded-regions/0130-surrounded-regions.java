class Solution {
    int x []={-1,1,0,0};
    int y[] ={0,0,-1,1};
    
    boolean valid(int i,int j,int n,int m)
    {
        if(i<0||i>=n||j<0||j>=m)
        return false;
    return true;
    }
    void dfs(char[][]a,int i,int j, int n ,int m )
    {
     a[i][j]='#';
     for(int k =0;k<4;k++)
      {
        int row = i+x[k];
        int col = j+y[k];
        if(valid(row ,col,n,m)&&a[row][col]=='O')
        dfs(a,row,col,n,m);
     }
    return;  
     }
    public void solve(char[][] board) {
        int n =board.length;
        int m =board[0].length;
        for(int j=0;j<m;j++)
         {
          if(board[0][j]=='O')
          dfs(board,0,j,n,m );

          if(board[n-1][j]=='O')
         dfs(board,n-1,j,n,m );
        }
        for(int i=0;i<n;i++)
        {
          if(board[i][0]=='O')
          dfs(board,i,0,n,m );

          if(board[i][m-1]=='O')
          dfs(board,i,m-1,n,m);
        }
         for(int i =0;i<n;i++)
         {
            for(int j =0;j<m;j++)
            {
                if(board[i][j]=='#')
                board[i][j] ='O';
               else
                board[i][j]='X';

            }
         }   

     return ;   
    
    }
}