class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            answer += c > 'l' ? c : 'l';
        } 
        
        return answer;
    }
}