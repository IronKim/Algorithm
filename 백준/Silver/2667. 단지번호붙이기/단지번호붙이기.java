import java.util.*;
import java.io.*;

public class Main {
    static int[][] fields;
    static List<Integer>[] lists;
    static boolean[][] visited;
    static int number;
    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int fieldSize = Integer.valueOf(br.readLine());
		fields = new int[fieldSize][fieldSize];
		visited = new boolean[fieldSize][fieldSize];
		
		for(int i = 0; i < fieldSize; i++) {
			String[] temp = br.readLine().split("");
			for(int j = 0; j < temp.length; j++) {
				fields[i][j] = Integer.valueOf(temp[j]);
			}
		}
		
		for(int i = 0; i < fields.length; i++) {
			for(int j = 0; j < fields[i].length; j++) {
				if(!visited[i][j] && fields[i][j] == 1) {
					number++;
					dfs(i, j);
				}
			}
		}
		
		System.out.println(number);
		map.values().stream().sorted().forEach(System.out::println);
    }
    
    public static void dfs(int y, int x) {
		visited[y][x] = true;
		map.put(number, map.getOrDefault(number, 0) + 1);
		
		for(int i = y - 1; i <= y + 1; i++) {
			if(0 <= i && i < fields.length && !visited[i][x] && fields[i][x] == 1) {
				dfs(i, x);
			}
		}
		
		for(int i = x - 1; i <= x + 1; i++) {
			if(0 <= i && i < fields[y].length && !visited[y][i] && fields[y][i] == 1) {
				dfs(y, i);
			}
		}
	}
}