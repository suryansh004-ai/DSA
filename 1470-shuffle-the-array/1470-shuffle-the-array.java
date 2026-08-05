class Solution {
    public int[] shuffle(int[] nums, int n) {
     int a[] = new int[2*n];
     
     for(int i =0 ,j=0 ;i<2*n;i=i+2,j++)
        a[i]=nums[j];

        for(int k =1,l=0;k<2*n;k=k+2,l++)
        a[k] = nums[n+l];
     
  return a;  }
}