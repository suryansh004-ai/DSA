class Solution {
    int x[] ={-1,1,0,0};
    int y []={0,0,-1,1};
    public int orangesRotting(int[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
        int fresh =0;
        int time =0;
        Queue<int[]>q = new LinkedList<>();
        //counting the fresh oranges and inserting the rotten ones into queue and storing there address in integer array
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(grid[i][j]==2)
                 q.add(new int[] {i,j});
                 
                if(grid[i][j]==1)
                fresh++;
            }
        }
        //while loop for checking the given sest of arrays BFS
       while(!q.isEmpty()&& fresh>0)
       {
        int s = q.size();
        for(int k =0;k<s;k++)
        {
            int [] curr = q.poll();
            int i =curr[0];
            int j = curr[1];

          //loop for 4 direction   
        for(int d=0; d<4;d++)
        {
            int ni= i+x[d];
            int nj =j+y[d];
           
           //if it goes out of 2d array then continue
           if(ni<0||ni>=n||nj<0||nj>=m)
           continue;
           
           // if fresh found make it rotten and reduce fresh
           if(grid[ni][nj]==1)
           {
            grid[ni][nj]=2;
            q.add(new int[] {ni,nj});
            fresh--;
           }
        }
        }
       time++;
    }
    //check if fresh left then return -1 else return time 
         if(fresh>0)
         return -1;

    return time; 
     

    }
}