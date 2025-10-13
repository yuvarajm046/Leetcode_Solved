import java.math.*;
class Solution {
    public int superPow(int a, int[] b) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<b.length;i++){
            str.append(b[i]);
        }
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = new BigInteger(str.toString());
        BigInteger mod = new BigInteger("1337");
        BigInteger ans = num1.modPow(num2, mod);
        return ans.intValue();
    }
}