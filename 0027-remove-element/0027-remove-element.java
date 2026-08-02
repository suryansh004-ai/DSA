class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0,j = nums.length-1 , temp;
        int cnt = 0;
        while(i<=j){
            if(nums[i]==val){
                cnt++;
                temp =nums[j];
                nums[j]= nums[i];
                nums[i] = temp;
                j--;
            }
            else i++;
        }
        return nums.length-cnt;
    }
}