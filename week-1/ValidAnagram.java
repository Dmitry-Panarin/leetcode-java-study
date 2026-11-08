import java.util.*;

/**
 * Valid Anagram (LeetCode 242, Easy)
 * https://leetcode.com/problems/valid-anagram/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1), массив из 26 счётчиков
 */
public class ValidAnagram {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (t.length() != s.length()) {
                return false;
            }

            int[] charList = new int[26];

            for (int i = 0; i < t.length(); i++) {
                charList[s.charAt(i) - 97] += 1;
                charList[t.charAt(i) - 97] += -1;
            }

            for (int num : charList) {
                if (num != 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().isAnagram(...) и сравнить с ожидаемым
    }
}
