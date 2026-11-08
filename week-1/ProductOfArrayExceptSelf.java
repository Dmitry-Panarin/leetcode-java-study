import java.util.*;

/**
 * Product of Array Except Self (LeetCode 238, Medium)
 * https://leetcode.com/problems/product-of-array-except-self/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1) доп. (без выходного массива)
 */
public class ProductOfArrayExceptSelf {

    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] leftSum = new int[nums.length];
            leftSum[0] = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                leftSum[i + 1] = leftSum[i] * nums[i];
            }
            int prod = 1;
            for (int i = nums.length - 1; i > -1; i--) {
                leftSum[i] = leftSum[i] * prod;
                prod = prod * nums[i];
            }

            return leftSum;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().productExceptSelf(...) и сравнить с ожидаемым
    }
}
