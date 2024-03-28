import java.math.BigInteger;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
		BigInteger n = BigInteger.valueOf(numer1 * denom2).add(BigInteger.valueOf(numer2 * denom1));
		BigInteger d = BigInteger.valueOf(denom1 * denom2);
        
        for(BigInteger i = BigInteger.TWO; n.max(d).compareTo(i) >= 0;) {
        	if(n.mod(i) == BigInteger.ZERO && d.mod(i) == BigInteger.ZERO) {
        		n = n.divide(i);
        		d = d.divide(i);
				continue;
        	}
        	
        	i = i.add(BigInteger.ONE);
        }
        
        answer[0] = n.intValue();
        answer[1] = d.intValue();
        
        return answer;
    }
}