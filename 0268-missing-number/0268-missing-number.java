class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
         int a = n * (n + 1) / 2;
         int s =0;
         for(int num : nums){
             s += num;
         }
        return a - s;
    }
}