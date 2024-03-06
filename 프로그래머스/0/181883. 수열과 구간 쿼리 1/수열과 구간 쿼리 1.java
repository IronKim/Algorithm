import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < queries.length; j++) {
        		if(queries[j][0] <= i && i <= queries[j][1]) {
        			answer[i]++;
        		}
        	}
        }
        
        return answer;
    }
}