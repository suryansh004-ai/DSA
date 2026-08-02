class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rst = 0, cst = 0, re = matrix.length-1, ce = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(rst<=re && cst <=ce)
        {
            for(int i=cst;i<=ce;i++){
                ans.add(matrix[rst][i]);
            }rst++;
            for(int i =rst;i<=re;i++){
                ans.add(matrix[i][ce]);
            }ce--;          
              if(rst<=re && cst<=ce){

                for(int i =ce;i>=cst;i--){
                ans.add(matrix[re][i]);
            }re--;
            for(int i = re;i>=rst;i--){
           ans.add(matrix[i][cst]);
            }cst++;
              }
        }
        return ans;
   }
}