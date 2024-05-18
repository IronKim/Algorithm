import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < n; j++) {
					arr[i][j] = Integer.valueOf(st.nextToken());
				}
			}
			
			int max = Integer.MIN_VALUE;
			for(int i = 0; i <= n - m; i++) {
				for(int j = 0; j <= n - m; j++) {
					int temp = 0;
					for(int a = i; a < i + m; a++) {
						for(int b = j; b < j + m; b++) {
							temp += arr[a][b];
						}
					}
					if(temp > max) {
						max = temp;
					}
				}
			}
			
			sb.append("#" + test_case + " " + max + "\n");
		}
		
		System.out.println(sb);
	}
}