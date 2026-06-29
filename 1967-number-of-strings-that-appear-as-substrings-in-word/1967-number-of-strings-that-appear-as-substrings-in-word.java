class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int freq =0;

        for(String i : patterns){

        if(word.contains(i))
        freq++;

        }

     return freq;}
}