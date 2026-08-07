class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        solve(candidates, candidates.length, 0,
              new ArrayList<>(), 0, res, target);

        return res;
    }

    void solve(int[] a, int n, int idx,
               List<Integer> diary, int sum,
               List<List<Integer>> res, int target) {

        // Base Case
        if (idx == n) {

            if (sum == target) {
                res.add(new ArrayList<>(diary));
            }

            return;
        }

        // Choice 1: Pick a[idx]
        if (sum + a[idx] <= target) {

            diary.add(a[idx]);

            // Same idx because we can reuse the same element
            solve(a, n, idx,
                  diary,
                  sum + a[idx],
                  res,
                  target);

            // Backtrack / Pop
            diary.remove(diary.size() - 1);
        }

        // Choice 2: Don't Pick a[idx]
        solve(a, n, idx + 1,
              diary,
              sum,
              res,
              target);
    }
}