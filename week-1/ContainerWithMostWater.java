import java.util.*;

/**
 * Container With Most Water (LeetCode 11, Medium)
 * https://leetcode.com/problems/container-with-most-water/
 *
 * Идея:
 * Время: O(n)
 * Память: O(1)
 */
public class ContainerWithMostWater {

    static class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxArea = 0;
            int area;

            while (left < right) {
                area = (right - left) * Math.min(height[right], height[left]);

                if (area > maxArea) {
                    maxArea = area;
                }

                if (height[right] > height[left]) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }

            return maxArea;
        }
    }

    public static void main(String[] args) {
        // Примеры из условия:
        // TODO: вызвать new Solution().maxArea(...) и сравнить с ожидаемым
    }
}
