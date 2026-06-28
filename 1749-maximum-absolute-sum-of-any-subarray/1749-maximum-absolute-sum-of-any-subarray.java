class Solution { 
    public  int maxSum(int a []){
        int best =a[0];
        int result = a[0];
        for(int i =1;i<a.length;i++){
            int c1 =a[i];
            int c2 = a[i]+best;
            best = Math.max(c1,c2);
            result = Math.max(result, best);

          }  return result;
        
    }  
     public static int minSum(int a []){
        int least =a[0];
        int result = a[0];
        for(int i =1;i<a.length;i++){
            int c1 =a[i];
            int c2 = a[i]+ least;
             least = Math.min(c1,c2);
            result = Math.min(result, least);

          }  return result;
        
    }  
      public int maxAbsoluteSum(int[] nums) {
         int mx = Math.abs(maxSum(nums));
         int mn = Math.abs(minSum(nums));
             
  return Math.max(mx,mn);
    }
}