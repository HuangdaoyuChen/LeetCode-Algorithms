/***
Author:     Douglas
Date:       Oct 3, 2017
Problem:    1.Two Sum
Difficulty: Easy
Source:     https://leetcode.com/problems/two-sum/description/
Runtime:    15ms

Notes:
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

***/

import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> myMap = new TreeMap<>();
         for (int i = 0; i < nums.length; i++) {
              myMap.put(nums[i], i);         
         }
         
         for (int j = 0; j < nums.length; j++) {
              int myTarget = target - nums[j];
              if (myMap.containsKey(myTarget) && myMap.get(myTarget) != j) {
                   return new int[] {j, myMap.get(myTarget)};
              }
         }
      
        throw new IllegalArgumentException("No two sum solution");
    }
}
