class Solution {
    public int sumOfPrimesInRange(int n) {
       int num =n,sum=0 , rev=0;
        while(n>0)
{
    rev = rev*10+ n%10;
    n = n/10;
}

int max = Math.max(rev, num);
int min = Math.min(rev, num);
 for(int i =min;i<=max;i++){

    int cnt =0;
            if (i <= 1)
               continue;
for(int j =2;j<=i/2;j++){
    if(i%j==0) cnt++;
}
if(cnt==0)
sum = sum+i;
 }
 
return sum ;

}

}