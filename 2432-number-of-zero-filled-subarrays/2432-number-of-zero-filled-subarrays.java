class Solution {
    public long zeroFilledSubarray(int[] nums) {
    long r = 0;
    for (int i = 0, j = 0; i < nums.length; ++i) {
        if (nums[i] != 0)
            j = i + 1;
         r += i - j + 1;
    }
    return r;
}
}