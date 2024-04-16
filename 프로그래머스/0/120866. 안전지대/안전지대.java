class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		if(board[i][j] == 1) {
        			answer--;
        			for(int a = i - 1; a <= i + 1; a++) {
        				for(int b = j - 1; b <= j + 1; b++) {
        					if(a < 0 || b < 0 || a >= board.length || b >= board[i].length) continue;
        					if(board[a][b] == 2 || board[a][b] == 1) continue;
        				
        					board[a][b] = 2;
        					answer--;
        				}
        			}
        		}
        		
        	}
        }
        
        
        return answer;
    }
}