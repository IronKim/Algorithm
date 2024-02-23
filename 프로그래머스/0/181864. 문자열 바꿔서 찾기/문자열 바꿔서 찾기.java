class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        
        for (char c : myString.toCharArray()) {
			answer += c == 'A' ? 'B' : 'A';
		}
        
        return answer.contains(pat) ? 1 : 0;
    }
}