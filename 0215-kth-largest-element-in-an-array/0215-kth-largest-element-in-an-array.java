class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        int i =0;
        for(i =0;i<k;i++) min.add(nums[i]);
        for(i =k;i<nums.length;i++){
            if(nums[i]<min.peek()) continue;
            else 
            {
                min.remove();
                min.add(nums[i]);

            }
        }
   return min.peek();
    }
}