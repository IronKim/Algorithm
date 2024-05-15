import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
		
		int testN = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testN; i++) {
			int fieldSize = Integer.valueOf(br.readLine());
			int[][] fields = new int[fieldSize][fieldSize];
			boolean[][] visited = new boolean[fieldSize][fieldSize];
			
			st = new StringTokenizer(br.readLine());
			int nowY = Integer.valueOf(st.nextToken());
			int nowX = Integer.valueOf(st.nextToken());
			int depth = 0;
			
			st = new StringTokenizer(br.readLine());
			int targetY = Integer.valueOf(st.nextToken());
			int targetX = Integer.valueOf(st.nextToken());
			
			Queue<int[]> queue = new LinkedList<int[]>();
			queue.add(new int[] {nowY, nowX, depth});
			visited[nowY][nowX] = true;
			
			while(!queue.isEmpty()) {
				int[] now = queue.poll();
				int ny = now[0];
				int nx = now[1];
				depth = now[2];
				
				if(ny == targetY && nx == targetX) {
					System.out.println(depth);
					break;
				}
				
				for(int j = 0; j < 8; j++) {
					ny = now[0] + dy[j];
					nx = now[1] + dx[j];
					
					if(0 <= ny && ny < fields.length && 0 <= nx && nx < fields[0].length) {
						if(!visited[ny][nx]) {
							queue.add(new int[] {ny, nx, depth + 1});
							visited[ny][nx] = true;
						}
					}
				}
			}	
		}
    }
}