class Solution {
    public boolean isPalindrome(int x) {
        int  rev =0 ,r=0;
        int org;
        org = x;
        if (x ==0)
        return true;
        while (x>0){
         rev = rev*10+x%10;
         x=x/10;   
        }
       return org ==rev;
        
    }
}