class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low =0,high = n-1;
        int res=-1;
        while(low<= high){
            int idx = (low+high)/2;
            if(nums[idx]>nums[n-1]) low = idx+1;
            else {
            res = idx;
            high = idx-1;
            }
        }
   return nums[res]; }
}