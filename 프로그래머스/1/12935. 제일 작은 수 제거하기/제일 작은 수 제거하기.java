import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        
        int min = Integer.MAX_VALUE;
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	answer.add(arr[i]);
        	if(min > arr[i]) {
        		min = arr[i];
        		idx = i;
        	}
        }
        
        answer.remove(idx);
        
        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}