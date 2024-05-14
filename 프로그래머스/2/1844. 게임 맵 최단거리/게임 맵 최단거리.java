import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        Queue<int[]> queue = new LinkedList<int[]>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        queue.add(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
        	int[] now = queue.poll();
        	int ny = now[0];
        	int nx = now[1];
        	int depth = now[2];
            
        	if(ny == maps.length - 1 && nx == maps[0].length - 1) {
                answer = depth;
                break;
            }
            
        	for(int i = 0; i < 4; i++) {
        		ny = now[0] + dy[i];
            	nx = now[1] + dx[i];
                
                if(0 <= ny && ny < maps.length && 0 <= nx && nx < maps[0].length && maps[ny][nx] == 1) {
                	if(!visited[ny][nx]){
                    	queue.add(new int[] {ny, nx, depth + 1});
                        visited[ny][nx] = true;
                    }
                }
            }
        }
        
        return answer;
    }
}