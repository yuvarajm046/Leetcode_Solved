import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {

        BigInteger bnum1=new BigInteger(num1);
        BigInteger bnum2=new BigInteger(num2);

        BigInteger mul=bnum1.multiply(bnum2);
        return(String.valueOf(mul));
        
    }
}