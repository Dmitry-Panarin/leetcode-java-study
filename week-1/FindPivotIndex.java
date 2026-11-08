import java.util.*;

/**
 * Find Pivot Index (LeetCode 724, Easy)
 * https://leetcode.com/problems/find-pivot-index/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1)
 */
public class FindPivotIndex {

    static class Solution {
        public int pivotIndex(int[] nums) {
            int totalSum = 0;
            int res = -1;
            for (int num : nums) {
                totalSum = totalSum + num;
            }
            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((totalSum - leftSum - nums[i]) == leftSum) {
                    res = i;
                    break;
                }
                leftSum = leftSum + nums[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().pivotIndex(...) и сравнить с ожидаемым
    }
}
