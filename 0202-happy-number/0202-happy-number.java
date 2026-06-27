class Solution {
    public static int fun(int n){
        int s =0;
        while(n>0){
         int  d= n%10;
            n =n/10;
            s = s+d*d;
        }
   return s;  }
    public boolean isHappy(int n) {
        int slow =n, fast = n;
        while(fast!=1){
            slow = fun(slow);
            fast =fun(fun(fast));
            if( slow!=1 && slow == fast)return false;
       }
       System.out.println("slow: " + slow + ", fast: " + fast);
return true;    }
}