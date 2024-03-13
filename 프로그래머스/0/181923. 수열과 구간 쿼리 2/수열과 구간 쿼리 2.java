import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < answer.length; i++) {
        	int k = queries[i][2];
        	answer[i] = Arrays.stream(
        			Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1))
        			.filter(n -> n > k).min().orElse(-1);
        }
        
        return answer;
    }
}