class Solution {
    public int gcdOfOddEvenSums(int n) {
int sod =0,sev =0;
int cnt =0;
//sumodd
        for(int i =1;i<=2*n;i++)
        { 
sod+= i;
i+=1;       }
//sumeven
        for(int i =2;i<=2*n;i++)
        { 
sev+= i;
i+=1;   
  }

//gcd

if(sev >sod)
{
    for(int i =1;i<=sod;i++)
    {
        if(sod%i==0&&sev%i==0)
        cnt = i;
    }
}

else 
{
      for(int i =1;i<=sev;i++)
    {
        if(sod%i==0&&sev%i==0)
        cnt = i;
    }
}
   return cnt; }
}