import java.util.*;
import java.io.*;

public class Main {
    static List<Integer>[] lists;
    static boolean[] visited;
    static int start;
    static int target;
    static boolean found;
    static int count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int relativesN = Integer.valueOf(br.readLine());
		visited = new boolean[relativesN + 1];
		lists = new ArrayList[relativesN + 1];
		
		for(int i = 0; i < lists.length; i++) {
			lists[i] = new ArrayList<Integer>();
		}
		
		st = new StringTokenizer(br.readLine());
		
		start = Integer.valueOf(st.nextToken());
		target = Integer.valueOf(st.nextToken());
		
		int m = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int t1 = Integer.valueOf(st.nextToken());
			int t2 = Integer.valueOf(st.nextToken());
			
			lists[t1].add(t2);
			lists[t2].add(t1);
		}
		
		for (List<Integer> list : lists) {
			Collections.sort(list);
		}
		
		dfs(start);
		
		System.out.println(found ? count : -1);
    }
    
    public static void dfs(int n) {
		visited[n] = true;
		if(target == n) found = true;
		if(!found) count++;
		else return;
		
		for (Integer i : lists[n]) {
			if(!visited[i]) {
				dfs(i);
				if(!found) count--;
			}
		}
	}
}