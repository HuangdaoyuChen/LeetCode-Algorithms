/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/

class Solution {
    public int missingNumber(int[] nums) {
        //compare sum of elems
        int sum = 0;
        for (int elem : nums) {
            sum += elem;
        }
        return (1 + nums.length)* nums.length /2 - sum;
    }
}
