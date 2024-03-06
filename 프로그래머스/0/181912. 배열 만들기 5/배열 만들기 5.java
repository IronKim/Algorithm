import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < intStrs.length; i++) {
        	if(k < Integer.parseInt(intStrs[i].substring(s, s + l))) {
        		answer.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
        	}
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}