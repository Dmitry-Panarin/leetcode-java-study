import java.util.*;

/**
 * Squares of a Sorted Array (LeetCode 977, Easy)
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1) доп. (без выходного массива)
 */
public class SquaresOfASortedArray {

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int[] result = new int[nums.length];

            for (int i = nums.length - 1; i >= 0; i--) {
                int leftSquare = nums[left] * nums[left];
                int rightSquare = nums[right] * nums[right];

                if (leftSquare > rightSquare) {
                    result[i] = leftSquare;
                    left++;
                } else {
                    result[i] = rightSquare;
                    right--;
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().sortedSquares(...) и сравнить с ожидаемым
    }
}
