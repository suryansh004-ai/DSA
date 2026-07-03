class Solution {
    public int findNumbers(int[] nums) {
        int  res =0;
        for(int i :nums)
        { int cnt =0;
          while(i>0){
            int r = i%10;
            cnt++;
            i =i/10;
          }
           if(cnt%2==0)
            res++;


        }
   return res; }
}