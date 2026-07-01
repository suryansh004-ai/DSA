import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] ne) {

        List<int[]> list = new ArrayList<>();
        List<int[]> ans = new ArrayList<>();

        boolean ins = false;

        // Step 1: Insert the new interval
        for (int[] interval : intervals) {

            if (!ins && ne[0] <= interval[0]) {
                list.add(ne);
                ins = true;
            }

            list.add(interval);
        }

        // If new interval has the largest start
        if (!ins) {
            list.add(ne);
        }

        // Step 2: Merge intervals
        int s1 = list.get(0)[0];
        int e1 = list.get(0)[1];

        for (int i = 1; i < list.size(); i++) {

            int s2 = list.get(i)[0];
            int e2 = list.get(i)[1];

            if (s2 <= e1) {
                e1 = Math.max(e1, e2);
            } else {
                ans.add(new int[]{s1, e1});
                s1 = s2;
                e1 = e2;
            }
        }

        // Add the last merged interval
        ans.add(new int[]{s1, e1});

        return ans.toArray(new int[ans.size()][]);
    }
}