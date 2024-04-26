import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, -0};
		Queue<int []> queue = new LinkedList<int[]>();
		boolean[][] visited;
		
		Scanner scanner = new Scanner(System.in);		
		String[] str = scanner.nextLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int m = Integer.valueOf(str[1]);
		
		int[][] arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			str = scanner.nextLine().split("");
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.valueOf(str[j]); 
			}
		}
		
		queue.add(new int[] {0,0});
		visited[0][0] = true;
		
		while(!queue.isEmpty() ) {
			int now[] = queue.poll();
			int nx = now[0];
			int ny = now[1];
			
			for(int i = 0; i < 4; i++) {
				int nextX = nx + dx[i];
				int nextY = ny + dy[i];
				
				if(nextX >=0 && nextX < n && nextY >= 0 && nextY < m) {
                    if(arr[nextX][nextY]==1 && !visited[nextX][nextY]) {
                    	queue.add(new int[] {nextX, nextY});
                        visited[nextX][nextY]=true;
                        arr[nextX][nextY] = arr[nx][ny]+1;
                    }
                }
			}
		}
		
		System.out.println(arr[n - 1][m - 1]);
	}
}