class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - 1) / n + 1];
        
        for(int i = 0, j = 0; i < answer.length; i++, j += n) {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}