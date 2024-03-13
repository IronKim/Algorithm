import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int temp = sides[0] + sides[1];
        if(temp > sides[1]) {
        	answer += temp - (sides[1] + 1);
        }
        for(int i = 1; i <= sides[1]; i++) {
        	if(i + sides[0] > sides[1]) {
        		answer++;
        	}
        }
        
        
        return answer;
    }
}