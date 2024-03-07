import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] temp = IntStream.rangeClosed(i, j).mapToObj(String::valueOf).toArray(String[]::new);
        
        for(String s : temp) {
        	for(char c : s.toCharArray()) {
        		if(Character.getNumericValue(c) == k) {
        			answer++;
        		}
        	}
        }
    
        return answer;
    }
}