class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        for(int i = 1 ; i <= 10; i++) {
        	temp *= i;
        	if(n < temp)
        		break;
        	answer = i;
        }
        
        return answer;
    }
}