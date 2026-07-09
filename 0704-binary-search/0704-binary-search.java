class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0,high = n-1;

    
    while(low<=high){
    int idx = (high+low)/2;
        if(nums[idx]==target)
return idx;
if(nums[idx]<target) 
low = idx+1;
else high = idx-1;
   }
return -1;}
}