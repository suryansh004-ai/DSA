class Solution {

    public int heightChecker(int[] heights) {

        // Create a separate copy
        int[] ans = heights.clone();

        // Sort the copy
        ans = bubble(ans, 0, ans.length - 1);

        int count = 0;

        // Compare original with sorted array
        for (int i = 0; i < ans.length; i++) {

            if (ans[i] == heights[i]) {
                continue;
            }

            count++;
        }

        return count;
    }

    int[] bubble(int[] ans, int a, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {

                if (ans[j] > ans[j + 1]) {

                    int temp = ans[j + 1];
                    ans[j + 1] = ans[j];
                    ans[j] = temp;
                }
            }
        }

        return ans;
    }
}

