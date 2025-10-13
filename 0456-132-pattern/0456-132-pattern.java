class Solution {
    public boolean find132pattern(int[] nums) {
        int min = Integer.MIN_VALUE;
        int p = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < min)
                return true;
            while (p < nums.length && nums[i] > nums[p])
                min = nums[p++];
            
            p--;
            nums[p] = nums[i];

        }
        return false;
    }
}