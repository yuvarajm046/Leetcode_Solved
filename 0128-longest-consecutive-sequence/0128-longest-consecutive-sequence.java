import java.util.Arrays;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int l = 1;
        int c = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;

            if (nums[i] == nums[i - 1] + 1) {
                c++;
            } else {
                l= Math.max(l, c);
                c = 1;
            }
        }

        return Math.max(l, c);
    }
}