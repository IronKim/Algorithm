import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        if(answer[answer.length - 2] > answer[answer.length - 3]) {
            answer[answer.length - 1] = answer[answer.length - 2] - answer[answer.length - 3];  
        }else {
            answer[answer.length - 1] = answer[answer.length - 2] * 2;
        }
        
        return answer;
    }
}