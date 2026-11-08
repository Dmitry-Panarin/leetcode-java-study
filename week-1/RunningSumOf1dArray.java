import java.util.*;

/**
 * Running Sum of 1d Array (LeetCode 1480, Easy)
 * https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1) доп. (без выходного массива)
 */
public class RunningSumOf1dArray {

    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] res_sum = new int[nums.length];
            res_sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                res_sum[i] = res_sum[i - 1] + nums[i];
            }
            return res_sum;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().runningSum(...) и сравнить с ожидаемым
    }
}
