/*
Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array 
such that nums[i] = nums[j]
and the absolute difference between i and j is at most k.

*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0)
            return false;

        Map<Integer, Integer> distinctNums = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (distinctNums.containsKey(nums[i])) {
                if (i - distinctNums.get(nums[i]) <= k)
                    return true;
            }
            distinctNums.put(nums[i], i);
        }
        return false;
    }
}
