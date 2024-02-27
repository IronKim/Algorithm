import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        int num = n;
        answer.add(num);
        while(num != 1) {
        	
        	if(num % 2 == 0) {
        		num /= 2;
        	}else {
        		num = 3 * num + 1;
        	}
        	
        	answer.add(num);
        	
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}