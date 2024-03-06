import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int i = 0; i < queries.length; i++) {
        	int temp = answer[queries[i][0]];
        	answer[queries[i][0]] = answer[queries[i][1]];
        	answer[queries[i][1]] = temp;
        }
        
        return answer;
    }
}