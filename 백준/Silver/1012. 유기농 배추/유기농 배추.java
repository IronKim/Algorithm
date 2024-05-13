import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited;
    static int[][] fields;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcaseN = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testcaseN; i++) {
			int wormN = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			
			fields = new int[n][m];
			visited = new boolean[n][m];
			
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int t1 = Integer.valueOf(st.nextToken());
				int t2 = Integer.valueOf(st.nextToken());
				
				fields[t2][t1] = 1;
			}
			
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < m; x++) {
					if(!visited[y][x] && fields[y][x] == 1) {
						dfs(y, x);
						wormN++;
					}
				}
			}
			
			System.out.println(wormN);
		}
    }
    
    public static void dfs(int y, int x) {
		visited[y][x] = true;
		
		for(int i = y - 1; i <= y + 1; i++) {
			if(-1 < i && i < fields.length && !visited[i][x] && fields[i][x] == 1) {
				dfs(i, x);
			}
		}
		for(int i = x - 1; i <= x + 1; i++) {
			if(-1 < i && i < fields[0].length && !visited[y][i] && fields[y][i] == 1) {
				dfs(y, i);
			}
		}
	}
}