import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		answer.add(arr[i]);
        	}
        }
        
        Collections.sort(answer);
        
        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}