class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
        }
        
        return answer;
    }
}