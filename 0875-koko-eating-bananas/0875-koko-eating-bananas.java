class Solution {
    public int minEatingSpeed(int[] pi, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int x : pi) {
            high = Math.max(high, x);
        }

        int res = -1;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            long hr = fun(pi, guess);

            if (hr > h) {
                low = guess + 1;
            } else {
                res = guess;
                high = guess - 1;
            }
        }

        return res;
    }

    long fun(int[] pi, int speed) {

        long h = 0;

        for (int i = 0; i < pi.length; i++) {

            h += pi[i] / speed;

            if (pi[i] % speed != 0)
                h++;
        }

        return h;
    }
}