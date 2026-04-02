class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            // agar list empty hai OR overlap nahi ho raha
            if (ans.size() == 0 || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(intervals[i]);
            }
            // overlap ho raha hai
            else {
                ans.get(ans.size() - 1)[1] =
                        Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }

        // ArrayList -> 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}
