import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static List<Integer>[] lists;
    static int count = -1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cC = Integer.valueOf(br.readLine()) + 1;
		int nC = Integer.valueOf(br.readLine());
        
        visited = new boolean[cC + 1];
		lists = new ArrayList[cC + 1];
		
		for (int i = 0; i < lists.length; i++) {
			lists[i] = new ArrayList<Integer>();
		}
        
        for(int i = 0; i < nC; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t1 = Integer.valueOf(st.nextToken());
			int t2 = Integer.valueOf(st.nextToken());
			
			lists[t1].add(t2);
			lists[t2].add(t1);
		}
        
        dfs(1);
		
		System.out.println(count);
		
    }
    
    public static void dfs(int n) {
		visited[n] = true;
		count++;
		
		for (Integer i : lists[n]) {
			if(!visited[i]) {
				dfs(i);
			}
		}
	}
}