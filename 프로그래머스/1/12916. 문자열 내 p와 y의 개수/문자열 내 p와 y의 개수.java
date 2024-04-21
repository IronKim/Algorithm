class Solution {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        
        s = s.toLowerCase();
        
        for(char c : s.toCharArray()) {
        	if(c == 'p') {
        		cntP++;
        	}else if(c == 'y') {
        		cntY++;
        	}
        }
        
        return cntP == cntY ? true : false;
    }
}