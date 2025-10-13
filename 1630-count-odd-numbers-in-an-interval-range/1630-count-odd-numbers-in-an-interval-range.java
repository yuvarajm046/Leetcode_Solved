class Solution {
    public int countOdds(int low, int high) {
       int t = high - low + 1;
        return (t + (low % 2)) / 2;
    
    }
}