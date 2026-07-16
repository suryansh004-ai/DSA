class Solution {
    public boolean searchMatrix(int[][] mrx, int target) {

    int n = mrx.length;
    int m = mrx[0].length;
    int row = n-1;
    int col =0;
    while(row>=0 && col<m){
    
        if(mrx[row][col]==target)return true;
        else if (mrx[row][col]>target) row--;
        else col++;


    }
        
   return false; }
}