class Solution {
    int[] color;
    boolean res = true;
    void dfs(int[][]a,int node,int c,int[]color)
    {

    }
    public boolean isBipartite(int[][] graph)
     {
     int n = graph.length;
     color = new int[n];
     Arrays.fill(color ,-1);


     for(int i =0;i<n;i++)
     {
       if(color[i]==-1)
       {
        dfs(graph , i,0);
             if(!res)
            {
            return false;
            } 
              }
       }

  return true;

    }
    void dfs(int [][]graph , int node,int col)
    {
      color[node]= col;
     
      for(int i =0;i<graph[node].length;i++)
      {
        int neigh = graph[node][i];
        if(color[neigh]!=-1)
        {
            if(color[neigh]==col)
            {
                res = false;
                return;
            }
        }
       else
       {

        dfs(graph , neigh,1-col);
        if(!res)
        return;
       }



      }

    }

}