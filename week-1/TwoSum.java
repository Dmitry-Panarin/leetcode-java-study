import java.util.*;

/**
 * Two Sum (LeetCode 1, Easy)
 * https://leetcode.com/problems/two-sum/
 *
 * Идея:
 * Время: O(n)
 * Память: O(n)
 */
public class TwoSum {

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> targetNums = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (targetNums.containsKey(target - nums[i])) {
                    return new int[]{targetNums.get(target - nums[i]), i};
                }
                targetNums.put(nums[i], i);
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().twoSum(...) и сравнить с ожидаемым
    }
}
