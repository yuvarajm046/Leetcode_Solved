class Solution {
    public int reverse(int x) {
        int n= Math.abs(x);  
        int r = 0;
        while (n != 0) {
            int ld = n % 10;
            if (r > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  
            }
            r = r * 10 + ld;  
            n = n / 10;
        } 
        return (x < 0) ? (-r) : r;
    }
}