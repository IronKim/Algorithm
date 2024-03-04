class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] temp = binomial.split(" ");
        
        int a = Integer.valueOf(temp[0]);
        String operator = temp[1];
        int b = Integer.valueOf(temp[2]);
        
        switch (operator) {
			case "+": {
				answer = a + b;
                break;
			}
			case "-": {
				answer = a - b;
                break;
			}
			case "*": {
				answer = a * b;
                break;
			}

		}
        
        return answer;
    }
}