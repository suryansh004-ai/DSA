class Solution {
    public int[] searchRange(int[] nums, int target) {

  return new int []{first(nums , target),last(nums, target)};
  


    }
    
int first(int[]nums,int x){
    int low =0,high = nums.length-1;
    int res =-1;
    while(low<=high){
        int idx = (low+high)/2;
        if(nums[idx]<x)
low =idx+1;
else if(nums[idx]>x) high = idx-1;
else {
res =idx;
high = idx-1;   }
}
return res;
}


int last(int[]nums,int x){
    int low =0,high = nums.length-1;
    int res =-1;
    while(low<=high){
        int idx = (low+high)/2;
        if(nums[idx]<x)
low =idx+1;
else if(nums[idx]>x) high = idx-1;
else {
res =idx;
low = idx+1;   }
}
return res;}




}