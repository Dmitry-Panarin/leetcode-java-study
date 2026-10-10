//https://leetcode.com/problems/contains-duplicate/solutions/8511846/video-3-solutions-with-sorting-set-and-l-43vm/
//Время O(n), Пространство O(n)
//Приём: использование HashSet для проверки уникальности элемента.
//Сложеое место: определить использовать map HashMap или использовать Set/HashSet.

import java.util.*;


public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean a = new Solution().containsDuplicate(new int[]{1, 1});
        System.out.println(a);
    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> numSet = new HashSet<>();

            for (int n : nums) {
                if (numSet.contains(n)) {
                    return true;
                }
                numSet.add(n);
            }

            return false;
        }
    }

}