import java.util.*;

/**
 * Group Anagrams (LeetCode 49, Medium)
 * https://leetcode.com/problems/group-anagrams/
 *
 * Идея:
 * Время: O(n * k log k), n слов длиной до k
 * Память: O(n * k)
 */
public class GroupAnagrams {

    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> wordTable = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);

                if (!wordTable.containsKey(key)) {
                    wordTable.put(key, new ArrayList<>());
                }

                wordTable.get(key).add(word);
            }

            return new ArrayList<>(wordTable.values());
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().groupAnagrams(...) и сравнить с ожидаемым
    }
}
