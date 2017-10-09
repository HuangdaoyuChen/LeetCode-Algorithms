/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

*/

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length ==0)
            return 0;
        for (int i =0; i< nums.length; i++) {
            if(nums[i] == target)
                return i;    
        }
        //not found, insert it
        for (int i =0; i<= nums.length; i++) {
            if (nums[0] >= target) 
                return 0;
            if (nums[nums.length-1] <= target) 
                return nums.length;
                    
            if(nums[i] <= target && nums[i+1] >= target)
                return i+1;    
        }
        return 0;
              
    }
}
