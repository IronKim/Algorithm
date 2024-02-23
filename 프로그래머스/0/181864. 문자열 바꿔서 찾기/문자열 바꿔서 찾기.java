class Solution {
    public int solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
			answer.append(c == 'A' ? 'B' : 'A');
		}
        
        return answer.toString().contains(pat) ? 1 : 0;
    }
}