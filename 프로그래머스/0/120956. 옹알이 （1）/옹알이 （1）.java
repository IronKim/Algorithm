class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
           
        for (int i = 0; i < babbling.length; i++) {
			String string = babbling[i];
			String dap = "";
			for(int j = 0; j < string.length(); j++) {
				if(string.charAt(j) == 'a') {
					dap += "aya";
					j += 2;
				}else if(string.charAt(j) == 'y') {
					dap += "ye";
					j += 1;
				}else if(string.charAt(j) == 'w') {
					dap += "woo";
					j += 2;
				}else if(string.charAt(j) == 'm') {
					dap += "ma";
					j += 1;
				}
			}
			
			if(string.equals(dap)) {
				answer++;
			}
			
		}
        
        return answer;
    }
}