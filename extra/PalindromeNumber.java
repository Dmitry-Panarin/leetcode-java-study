import java.util.*;

/**
 * Palindrome Number (LeetCode 9, Easy)
 * https://leetcode.com/problems/palindrome-number/
 *
 * Идея:
 * Время: O(d^2), d = число цифр (конкатенация строк в цикле)
 * Память: O(d)
 */
public class PalindromeNumber {

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            if (x == 0) {
                return true;
            }

            String polyndrome = "";
            int x_c = x;

            while (x_c > 0) {
                polyndrome = polyndrome + Integer.toString(x_c % 10);
                x_c = x_c / 10;
            }

            return Integer.toString(x).equals(polyndrome);
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().isPalindrome(...) и сравнить с ожидаемым
    }
}
