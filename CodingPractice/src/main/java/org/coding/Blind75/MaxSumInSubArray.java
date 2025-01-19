package org.coding.Blind75;

// Link : https://leetcode.com/problems/maximum-subarray/description/

        /*Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        Example 2:
        Input: nums = [1]
        Output: 1
        Explanation: The subarray [1] has the largest sum 1.

        Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23
        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/
public class MaxSumInSubArray {
    public static void main(String[] args) {
        int nums [] = {-1};
        System.out.println("The subarray has largest sum as :"+maxSumInSubArray(nums));
    }

    //Using Kadane's Algorithm
    private static int maxSumInSubArray(int[] nums){
        int res = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i : nums){
            currentSum += i;
            res = Math.max(currentSum,res);
            if(currentSum < 0) //handles scenario when currentSum of nos becomes negative
                currentSum = 0;
        }
        return res;
    }

}
