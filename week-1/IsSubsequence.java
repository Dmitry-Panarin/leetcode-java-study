import java.util.*;

/**
 * Is Subsequence (LeetCode 392, Easy)
 * https://leetcode.com/problems/is-subsequence/
 *
 * Идея:
 * Время: O(m), m = длина t
 * Память: O(1)
 */
public class IsSubsequence {

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) {
                return false;
            }

            int pointS = 0;
            int pointT = 0;
            boolean res = true;

            while (pointS < s.length()) {
                if (pointT > t.length() - 1) {
                    res = false;
                    break;
                }
                if (s.charAt(pointS) == t.charAt(pointT)) {
                    pointS += 1;
                }
                pointT += 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().isSubsequence(...) и сравнить с ожидаемым
    }
}
