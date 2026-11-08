import java.util.*;

/**
 * Contains Duplicate (LeetCode 217, Easy)
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Идея:
 * Время: O(n)
 * Память: O(n)
 */
public class ContainsDuplicate {

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            boolean result = false;
            Map<Integer, Integer> duplicate = new HashMap<>();
            for (int num : nums) {
                if (duplicate.containsKey(num)) {
                    result = true;
                    break;
                } else {
                    duplicate.put(num, 1);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().containsDuplicate(...) и сравнить с ожидаемым
    }
}
