import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        
        int temp = n;
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		answer.add(i);
        	}
        }
        
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }
}