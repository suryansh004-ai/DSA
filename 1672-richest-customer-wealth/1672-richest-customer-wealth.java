class Solution {
    public int maximumWealth(int[][] ac) {
        int  res =0;
        for(int i =0;i<ac.length;i++)

        { int sum =0;
             for(int j=0;j<ac[i].length;j++)
               {
                    sum = sum + ac[i][j];
                }
               
               res = Math.max(res,sum);
        }
  return res;  }
}