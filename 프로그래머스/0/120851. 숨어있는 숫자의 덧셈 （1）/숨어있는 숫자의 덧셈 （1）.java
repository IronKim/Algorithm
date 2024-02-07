class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
			int tmp = Character.getNumericValue(my_string.charAt(i));
			if(tmp < 10) {
				answer += tmp;
			}
		}
        
        return answer;
    }
}