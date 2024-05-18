import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.valueOf(br.readLine());
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= i; j++) {
					if(j == 0 || j == i) {
						arr[i][j] = 1;
						continue;
					}
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
			
			System.out.println("#" + test_case);
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}