class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<int[]> st = new Stack<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            // Stack is empty
            if (st.isEmpty()) {
                st.push(new int[]{c, 1});
                continue;
            }

            // Different character
            if (st.peek()[0] != c) {
                st.push(new int[]{c, 1});
                continue;
            }

            // Same character
            if (st.peek()[1] < (k - 1)) {

                int[] p = st.pop();

                st.push(new int[]{p[0], p[1] + 1});

                continue;
            }

            // Count becomes k
            st.pop();
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {

            int[] p = st.pop();

            while (p[1]-- > 0) {
                res.append((char) p[0]);
            }
        }

        return res.reverse().toString();
    }
}