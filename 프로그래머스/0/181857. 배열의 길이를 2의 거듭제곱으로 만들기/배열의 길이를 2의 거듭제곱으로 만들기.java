import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int temp = 1;
        while(arr.length > temp) {
        	temp *= 2;
        }
        int[] answer = Arrays.copyOf(arr, temp);
        
        
        return answer;
    }
}