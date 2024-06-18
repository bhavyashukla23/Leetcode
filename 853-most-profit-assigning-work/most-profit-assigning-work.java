import java.util.Arrays;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];

        // Combine difficulty and profit into a single array
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        // Sort jobs by difficulty (and by profit if difficulties are the same)
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // Sort workers by their abilities
        Arrays.sort(worker);

        int maxProfit = 0;
        int totalProfit = 0;
        int j = 0;

        // Assign jobs to workers
        for (int ability : worker) {
            // Update maxProfit for jobs the worker can do
            while (j < n && ability >= jobs[j][0]) {
                maxProfit = Math.max(maxProfit, jobs[j][1]);
                j++;
            }
            totalProfit += maxProfit;
        }

        return totalProfit;
    }
}
