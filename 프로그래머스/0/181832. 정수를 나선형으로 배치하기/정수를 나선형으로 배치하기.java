class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int x = 0;
        int y = 0;
        int mode = 1;
        boolean temp = true;
        int t = n;
        int m = 1;
        
        for(int i = 1; i <= n * n; i++) {
        	answer[y][x] = i;
       	
        	if(t - m == 0) {
        		if(temp) {
        			temp = false;
        			t--;
        			mode++;
        		}else {
        			temp = true;
        			mode++;
        		}
        		m = 0;
        	}

        	switch(mode % 4) {
	    		case 0: y--; break;
	    		case 1: x++; break;
	    		case 2: y++; break;
	    		case 3: x--; break;
        	}
        	
        	m++;	
        }
        
        return answer;
    }
}