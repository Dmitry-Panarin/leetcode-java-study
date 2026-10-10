//https://leetcode.com/problems/running-sum-of-1d-array/
//Время: O(n), Пространство: O(n)
//Приём, создаём дополнительнйы массив, который заполняем при каждой итерации по заданному массиву.
//Сложных мест не было.
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res_sum = new int[nums.length];
        res_sum[0] = nums[0];
        for (int i =1; i < nums.length; i++){
            res_sum[i] = res_sum[i-1] + nums[i];
        }
        return res_sum;
    }
}