import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = l; i <= r; i++) {
        	String temp = String.valueOf(i);
        	boolean t = true;
        	for (char c : temp.toCharArray()) {
				if(c != '0' && c != '5')
					t = false;
			}
        	
        	if(t) {
        		answer.add(i);
        	}
        	
        }
        
        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}