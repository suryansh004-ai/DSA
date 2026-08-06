

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int res =-1;
int cnt =0 ;
     for(int i: nums)
     {
        if(i==1)
            cnt++;
            else {
             cnt =0;
            continue;
            }
     
      res = Math.max( cnt , res);
     }
     if(res ==-1)
     return 0;
     else 
   return res; }
}