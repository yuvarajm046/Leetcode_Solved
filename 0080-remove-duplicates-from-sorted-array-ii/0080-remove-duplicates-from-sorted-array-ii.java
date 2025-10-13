class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2,n=nums.length;
        if(n<=2) return n;

        for(int j=2;j<n;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}