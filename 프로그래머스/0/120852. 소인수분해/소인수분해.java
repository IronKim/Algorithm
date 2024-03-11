import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new HashSet<Integer>();
        
        for(int i = 2; i <= n; i++) {
        	if(n % i == 0) {
        		answer.add(i);
                n /= i;
                i = 1;
        	}
        }
        
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}