

class Solution {
    public String reorganizeString(String s) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }


        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(new int[]{freq[i], i});
            }
        }

        StringBuilder result = new StringBuilder();
        int[] prev = new int[]{0, -1}; // previous character (count, index)

        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            result.append((char)(current[1] + 'a'));
            current[0]--;

            // Push back the previous character if it still has remaining count
            if (prev[0] > 0) {
                maxHeap.offer(prev);
            }

            // Update prev to current
            prev = current;
        }

        // If result length != input length, impossible
        return result.length() == s.length() ? result.toString() : "";
    }
}
