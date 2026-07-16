class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int n =mat.length;
        int m = mat[0].length;
        int low = mat[0][0];
        int high = mat[n-1][m-1];
        int res =-1;
        while(low<= high){
            int guess =(low+high)/2;
            int ans = fun(mat ,n,m,guess);
            if(ans<k) low = guess+1;
            else {
                res = guess;
                high = guess-1;

            }
        }

    return res;    
    }

int fun(int[][]a,int n ,int m,int ges){
    int row = n-1;
    int col =0 ,cnt = 0;
    while(row>=0 && col<m){
        if(a[row][col]<= ges){
cnt = cnt +row+1;
col++;} 

else
    row--;

   }

return cnt;
}

}