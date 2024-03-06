class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = 0; i < myString.lastIndexOf(pat); i++) {
        	answer += myString.charAt(i);
        }
        
        return answer + pat;
    }
}