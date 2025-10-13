class Solution {
    public int sumBase(int n, int k) {
        int d=0,sum=0;
        while(n>0){
            d=n%k;
            sum=sum+d;
            n=n/k;
        }
        return sum;
    }
}