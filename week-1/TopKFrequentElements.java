import java.util.*;

/**
 * Top K Frequent Elements (LeetCode 347, Medium)
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Идея:
 * Время: O(n log n)
 * Память: O(n)
 */
public class TopKFrequentElements {

    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> result = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                result.merge(nums[i], 1, Integer::sum);
            }

            List<Integer> keys = new ArrayList<>(result.keySet());
            keys.sort((a, b) -> Integer.compare(result.get(b), result.get(a)));

            return keys.subList(0, k).stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().topKFrequent(...) и сравнить с ожидаемым
    }
}
