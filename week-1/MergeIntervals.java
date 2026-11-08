import java.util.*;

/**
 * Merge Intervals (LeetCode 56, Medium)
 * https://leetcode.com/problems/merge-intervals/
 *
 * Идея:
 * Время: O(n log n)
 * Память: O(n)
 */
public class MergeIntervals {

    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> result = new ArrayList<>();

            // 1. Выбери первый интервал в качестве текущего.
            int i = 0;
            int end, nextStart;
            while (i < intervals.length - 1) {
                end = intervals[i][1];
                nextStart = intervals[i + 1][0];

                if (end >= nextStart) {
                    intervals[i + 1] = new int[]{intervals[i][0], Math.max(end, intervals[i + 1][1])};
                } else {
                    result.add(intervals[i]);
                }
                i++;
            }
            result.add(intervals[i]);
            return result.toArray(new int[result.size()][]);
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().merge(...) и сравнить с ожидаемым
    }
}
