class Solution {
    public int findDuplicate(int[] nums) {
        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index] > 0) nums[index] = -nums[index];
            else return index;
        }
        return -1; // Should not reach here
    }
}
