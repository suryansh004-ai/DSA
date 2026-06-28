class Solution {
    public int maximumSum(int[] arr) {

        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int prevNo = noDel;
            int prevOne = oneDel;

            noDel = Math.max(arr[i], prevNo + arr[i]);

            if (prevOne == Integer.MIN_VALUE)
                oneDel = prevNo;
            else
                oneDel = Math.max(prevNo, prevOne + arr[i]);

            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return ans;
    }
}
