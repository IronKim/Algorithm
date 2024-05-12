import java.util.*;

public class Main {
    static boolean[] visited;
    static List<Integer>[] lists;
    static Queue<Integer> queue = new LinkedList<Integer>();
    static StringBuilder dfsOrder = new StringBuilder();
    static StringBuilder bfsOrder = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);
        int start = Integer.valueOf(str[2]);
        
        visited = new boolean[n + 1];
        lists = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            lists[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < m; i++) {
            str = scanner.nextLine().split(" ");
            int t1 = Integer.valueOf(str[0]);
            int t2 = Integer.valueOf(str[1]);
            
            lists[t1].add(t2);
            lists[t2].add(t1);
        }
        for (List<Integer> list : lists) {
            Collections.sort(list);
        }
        
        dfs(start);
        visited = new boolean[n + 1];
        bfs(start);
        
        System.out.println(dfsOrder.toString().trim());
        System.out.println(bfsOrder.toString().trim());
	}
    
     public static void dfs(int n) {
        visited[n] = true;
        dfsOrder.append(n + " ");
        
        for (Integer i : lists[n]) {
            if(!visited[i]) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int n) {
        queue.add(n);
        visited[n] = true;
        
        while(!queue.isEmpty()) {
            n = queue.poll();
            bfsOrder.append(n + " ");
            
            for (Integer i : lists[n]) {
                if(!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}