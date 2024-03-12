import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger t = BigInteger.ONE;
		BigInteger n = BigInteger.ONE;
		BigInteger m = BigInteger.ONE;
        
        for(int i = balls; i >= 1; i--) {
        	n = n.multiply(new BigInteger(String.valueOf(i)));
        }
        for(int i = share; i >= 1; i--) {
        	m = m.multiply(new BigInteger(String.valueOf(i)));
        }
        for(int i = balls - share; i >= 1; i--) {
        	t = t.multiply(new BigInteger(String.valueOf(i))); 
        }
        t = t.multiply(m);
        
        return Integer.valueOf(n.divide(t).toString());
    }
}