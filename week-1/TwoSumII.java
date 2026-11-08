import java.util.*;

/**
 * Two Sum II - Input Array Is Sorted (LeetCode 167, Medium)
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1)
 */
public class TwoSumII {

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int point1 = 0;
            int point2 = numbers.length - 1;
            int num1, num2;

            while (point1 < point2) {
                num1 = numbers[point1];
                num2 = numbers[point2];

                if ((num1 + num2) == target) {
                    return new int[]{point1 + 1, point2 + 1};
                }

                if ((num1 + num2) > target) {
                    point2 -= 1;
                } else {
                    point1 += 1;
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().twoSum(...) и сравнить с ожидаемым
    }
}
