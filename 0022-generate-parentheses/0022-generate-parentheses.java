import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(0, 0, n, "", ans);
        return ans;
    }

    private void solve(int open, int close, int n,
                       String temp,
                       List<String> ans) {

        // Base Case
        if (open == n && close == n) {
            ans.add(temp);
            return;
        }

        // First Choice
        if (open < n) {
            solve(open + 1, close, n, temp + "(", ans);
        }

        // Second Choice
        if (close < open) {
            solve(open, close + 1, n, temp + ")", ans);
        }
    }
}