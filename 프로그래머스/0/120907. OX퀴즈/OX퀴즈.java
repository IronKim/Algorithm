class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
			String[] temp =quiz[i].split(" ");
			int x = Integer.parseInt(temp[0]);
			String operator = temp[1];
			int y = Integer.parseInt(temp[2]);
			int dap = Integer.parseInt(temp[4]);
			
			if(operator.equals("+")) answer[i] = x + y == dap ? "O" : "X";
			else answer[i] = x - y == dap ? "O" : "X";
			
		}
        
        return answer;
    }
}