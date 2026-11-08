import java.util.*;

/**
 * Valid Palindrome (LeetCode 125, Easy)
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Идея:
 * Время: O(n)
 * Память: O(n), новая строка после replaceAll
 */
public class ValidPalindrome {

    static class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().isPalindrome(...) и сравнить с ожидаемым
    }
}
