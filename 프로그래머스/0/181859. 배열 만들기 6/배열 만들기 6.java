import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> answer = new Stack<Integer>();
        
        int i = 0;
        
        while(i < arr.length) {
        	if(answer.isEmpty()) {
        		answer.push(arr[i]);
        		i++;
                continue;
        	}
        	
        	if(answer.peek() == arr[i]) {
        		answer.pop();
        		i++;
        	}else {
        		answer.push(arr[i]);
        		i++;
        	}
        	
        	
        }
        
        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}