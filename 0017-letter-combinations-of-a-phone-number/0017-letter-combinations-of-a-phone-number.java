class Solution {
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
      
      if(digits.length()==0)
         return res;
HashMap<Character,String> map =new HashMap<>();
map.put('2',"abc");
map.put('3',"def");
map.put('4',"ghi");
map.put('5',"jkl");
map.put('6',"mno");
map.put('7',"pqrs");
map.put('8',"tuv");
map.put('9',"wxyz");

solve(digits ,0,new StringBuilder(),map);
return res;
    }
void solve(String digits,int idx,StringBuilder diary,HashMap<Character,String>map){
    //base case
    if(idx== digits.length()){
        res.add(diary.toString());
        return;
    }
//choice
String ch =map.get(digits.charAt(idx));


//explore all choices
for(int i=0;i<ch.length();i++)
{//pick
  diary.append(ch.charAt(i));
//recurse
solve(digits,idx+1,diary,map);
//backtrack
diary.deleteCharAt(diary.length()-1);

}












}


}