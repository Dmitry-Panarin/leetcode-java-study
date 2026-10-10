//https://leetcode.com/problems/running-sum-of-1d-array/
//Время: O(n), Пространство: O(n)
//Приём - префиксные суммы res[i] = res[i-1] + nums[i]
//Сложных мест не было.

public class RunningSum{
    static class Solution {
    public int[] runningSum(int[] nums) {
        int[] resSum = new int[nums.length];
        resSum[0] = nums[0];
        for (int i =1; i < nums.length; i++){
            resSum[i] = resSum[i-1] + nums[i];
        }
        return resSum;
    }
}
}