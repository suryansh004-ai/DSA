class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int best = nums[0];
        int  total = nums[0];
        int res = nums[0];
        int least = nums[0];
        int ans = nums[0];

        for(int i =1 ;i<nums.length;i++){
            total+=nums[i];
            best = Math.max(best+nums[i],nums[i]);
            res = Math.max(res , best); 
            
            least = Math.min(least+nums[i],nums[i]);
            ans = Math.min(ans ,least);
            
             }
if(res<0)
return res;

        
 return(Math.max(res,total - ans)) ;  }
}