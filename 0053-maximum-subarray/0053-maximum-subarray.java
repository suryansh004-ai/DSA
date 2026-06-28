class Solution {
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int result = nums[0];
        for(int i =1;i<nums.length;i++)
        {       
            int c1 = nums[i];
            int  c2 = nums[i]+best;
            best = Math.max(c1,c2);
             result = Math.max( result , best);
 }  
 return result;
   }
}