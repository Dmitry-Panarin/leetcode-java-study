import java.util.*;

/**
 * Roman to Integer (LeetCode 13, Easy)
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1)
 */
public class RomanToInteger {

    static class Solution {
        public int romanToInt(String s) {
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                res += switch (s.charAt(i)) {
                    case 'I' -> {
                        if (i == s.length() - 1) {
                            yield 1;
                        }

                        if (s.charAt(i + 1) == 'V') {
                            i++;
                            yield 4;
                        } else if (s.charAt(i + 1) == 'X') {
                            i++;
                            yield 9;
                        } else {
                            yield 1;
                        }
                    }
                    case 'V' -> 5;
                    case 'X' -> {
                        if (i == s.length() - 1) {
                            yield 10;
                        }

                        if (s.charAt(i + 1) == 'L') {
                            i++;
                            yield 40;
                        } else if (s.charAt(i + 1) == 'C') {
                            i++;
                            yield 90;
                        } else {
                            yield 10;
                        }
                    }
                    case 'L' -> 50;
                    case 'C' -> {
                        if (i == s.length() - 1) {
                            yield 100;
                        }

                        if (s.charAt(i + 1) == 'D') {
                            i++;
                            yield 400;
                        } else if (s.charAt(i + 1) == 'M') {
                            i++;
                            yield 900;
                        } else {
                            yield 100;
                        }
                    }
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> 0;
                };
            }
            return res;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().romanToInt(...) и сравнить с ожидаемым
    }
}
