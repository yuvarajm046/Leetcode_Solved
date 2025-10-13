class Solution {
    public int searchInsert(int[] n, int t) {
        int c=0;
        for(int i=0;i<n.length;i++){
            if(n[i] < t){
                c++;
            }
        }
        return c;
    }
}