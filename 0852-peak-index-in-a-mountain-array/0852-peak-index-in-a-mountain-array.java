class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low =0,high = arr.length-1;
        int res =-1;
        while(low<=high){
            int idx = (low+high)/2;
            if(arr[idx]<arr[idx+1]) low = idx+1;
            else{
                res = idx;
                high = idx -1;
            }

        }
      return res;  
    }
}