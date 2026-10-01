class Solution {
    HashMap<Integer,Integer> dp = new HashMap<>();

    public int climbStairs(int n) {
    return fun(0,n);
  }

  int fun(int i , int n)
  {
    if(i==n)
    return 1;

    if(i>n)
    return 0;

    
    if(dp.containsKey(i))
     return dp.get(i); 
    
    int a = fun(i+1 ,n);
    int b = fun(i+2 ,n);
     int ans = a+b;
     dp.put(i,ans);
    return ans;




  }
}