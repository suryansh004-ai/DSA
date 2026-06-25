class Solution {
    public boolean isAnagram(String s, String t) {
       int[] fre = new int[126];
       if(s.length()!=t.length())
       return false;

        for(int i=0;i<s.length();i++){
          fre[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
{         fre[t.charAt(i)-'a']--;
 
}  

for( int cnt:fre){
    if(cnt!=0)
 return false;
 }
   
return true ;   }
}