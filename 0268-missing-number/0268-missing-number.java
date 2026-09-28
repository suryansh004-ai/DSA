class Solution {
    public int missingNumber(int[] nums) {
        int xor =0;
    for( int n =0;n<=nums.length;n++)
    {
        xor = xor^n;
    }

    for(int i :nums)
    {
        xor =xor^i;
    }
   return xor;
    }
}