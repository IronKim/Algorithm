import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Stack<Integer> answer = new Stack<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(!answer.contains(arr[i])) {
        		answer.push(arr[i]);
                
                if(answer.size() == k) {
                    break;
                }
        	}
        }
        
        while(answer.size() < k) {
        	answer.push(-1);
        }
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}