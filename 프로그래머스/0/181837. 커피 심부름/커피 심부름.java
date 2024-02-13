class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String string : order) {
			if(string.contains("americano") || string.contains("anything")) {
				answer += 4500;
			}else {
				answer += 5000;
			}
		}
        
        return answer;
    }
}