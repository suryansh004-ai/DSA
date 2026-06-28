class Solution {
    public int maxProduct(int[] nums) {
     int mx =nums[0];
     int mn = nums[0];
     int result =nums[0];
     for(int i =1;i<nums.length;i++)
     {
        int c1 =nums[i];
        int c2 = nums[i]* mn;
        int c3 = nums[i]* mx; 
          mn = Math.min(c1,Math.min(c2,c3));
          mx = Math.max(c1,Math.max(c2,c3));
          result = Math.max(result,Math.max(mx,mn));
      }   
  return result;
     }
}