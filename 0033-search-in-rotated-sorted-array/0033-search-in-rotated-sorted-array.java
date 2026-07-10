class Solution {
    public int search(int[] nums, int target) {
        int low =0,high =nums.length-1;
        int res =-1;
        while(low<=high)
{
    int idx = (low+high)/2;
    if(nums[idx]==target) 
    {   res= idx;
        return res;
        }
if(nums[idx]>nums[nums.length-1])
{
if(nums[idx]<target)
low= idx+1;

else
{
    if(nums[0]>target)low =idx+1;
    else high =idx-1;

}continue;

}

if(nums[idx]>target) high =idx-1;
else {
    if(nums[nums.length-1]<target) high = idx-1;
    else low = idx+1;
}  }      
  return res;  }
}