import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[][] answer = new int [n][n];
        List<Integer> list = new ArrayList<Integer>();
        int num = 1;
        int x = 0;
        int y = 0;
        int mode = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		answer[y][x] = num;
        		
        		switch (mode) {
    			case 0:
    				if(y + 1 < n  && answer[y + 1][x] == 0 ) {
    					y++;
    					num++;
    					break;
    				}
    				mode = (mode + 1) % 3;
    			case 1:
    				if(x + 1 < y + 1 && answer[y][x + 1] == 0) {
    					x++;
    					num++;
    					break;
    				}
    				mode = (mode + 1) % 3;
    			case 2:
    				if(y - 1 > 0 && x - 1 > 0 && answer[y - 1][x - 1] == 0) {
    					y--;
    					x--;
    					num++;
    					break;
    				}
    				mode = (mode + 1) % 3;
	        	}
	        }
        }
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(answer[i][j] != 0) {
        			list.add(answer[i][j]);
        		}
        	}
        }
        
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}