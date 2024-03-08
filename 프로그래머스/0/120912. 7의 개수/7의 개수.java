import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        
        for(char i : str.toCharArray()) {
        	if(i == '7') {
        		answer++;
        	}
        }
        
        return answer;
    }
}