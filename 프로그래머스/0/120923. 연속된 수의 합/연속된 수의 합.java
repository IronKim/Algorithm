import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = -500; i < Integer.MAX_VALUE; i++) {
        	int hap = 0;
        	for(int j = 0; j < num; j++) {
        		hap += i + j;
        	}
        	if(hap == total) {
        		for(int j = 0; j < num; j++) {
            		answer.add(i + j);
            	}
        		break;
        	}
        	
        }
      
        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}