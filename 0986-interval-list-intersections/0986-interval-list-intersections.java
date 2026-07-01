class Solution {
    public int[][] intervalIntersection(int[][] fi, int[][] se) {

        List<int[]> ans = new ArrayList<>();

        int i = 0 ,j = 0;

        while (i < fi.length && j < se.length) {

            int s = Math.max(fi[i][0], se[j][0]);
            int e = Math.min(fi[i][1], se[j][1]);

            if (s <= e) 
                ans.add(new int[]{s, e});
            

            if (fi[i][1] < se[j][1]) 
                i++;
             else 
                j++;
            
        }

        return ans.toArray(new int[ans.size()][]);
    }
}