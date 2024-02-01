class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int i = num_list.length - 1;
        
        for(int j = 0; j < answer.length; j++) {
            answer[j] = num_list[i--];
        }
        
        return answer;
    }
}