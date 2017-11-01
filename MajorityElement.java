/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            Integer freq = map.get(i);
            map.put(i, (freq == null) ? 1 : freq + 1);
        }

        for (int i :map.keySet() ){
            if (map.get(i) > nums.length /2)
                return i;
                
        }
        return 0;
        
    }
}
