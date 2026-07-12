class Solution {
    public int majorityElement(int[] nums) {
       int count =0; 
    int  x =nums[0];
    for(int i =1 ;i<nums.length;i++){
        if(nums[i]==x)count++;
    else count--;

    if(count ==-1){
    x = nums[i]; 
    count++;  } }
   return x; }
}
