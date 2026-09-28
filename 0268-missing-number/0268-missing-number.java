class Solution {
    public int missingNumber(int[] nums) {
        
    HashMap<Integer,Boolean> map = new HashMap<>();
    for( int num:nums)
    {
        map.put(num, true);
    }

    for(int i =0;i<=nums.length;i++)
    {
        if(!map.containsKey(i))
        return i;
    }
   return -1;
    }
}