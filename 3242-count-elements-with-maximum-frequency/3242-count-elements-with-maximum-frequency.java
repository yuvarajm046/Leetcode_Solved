class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] f = new int[101];
        int m = 0;
        for(int i : nums){
            f[i]++;
            m = Math.max(m, f[i]);
        }
        int a =0;
        for(int i : f){
            if(i == m) a += i;
        }
        return a;
    }
}