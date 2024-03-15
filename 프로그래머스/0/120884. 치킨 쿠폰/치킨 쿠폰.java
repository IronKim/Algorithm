class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = chicken;
        
        while(temp >= 10) {
        	answer += temp / 10;
        	temp = temp / 10 + temp % 10;
        }
        
        return answer;
    }
}