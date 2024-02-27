import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<Integer>();
        
        for(char c : my_string.toCharArray()) {
        	if(Character.isDigit(c)) {
        		answer.add(Character.getNumericValue(c));
        	}
        }
        
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}