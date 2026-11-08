import java.util.*;

/**
 * Subarray Sum Equals K (LeetCode 560, Medium)
 * https://leetcode.com/problems/subarray-sum-equals-k/
 *
 * Идея:
 * Время: O(n^2)
 * Память: O(1)
 */
public class SubarraySumEqualsK {

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int res = 0;

            for (int i = 0; i < nums.length; i++) {
                int count = 0;

                for (int j = i; j < nums.length; j++) {
                    count += nums[j];

                    if (count == k) {
                        res++;
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().subarraySum(...) и сравнить с ожидаемым
    }
}
