import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int testN = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= testN; i++) {
			int size = Integer.valueOf(br.readLine());
			int[] tmp = new int[size];
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < size; j++) {
				tmp[j] = Integer.valueOf(st.nextToken());
			}
			
			long answer = 0;
			int max = Integer.MIN_VALUE;
			for(int j = size - 1; j >= 0; j--) {
				if(tmp[j] > max) {
					max = tmp[j];
					continue;
				}
				answer += max - tmp[j];
			}	
			sb.append("#" + i + " " + answer + "\n");
		}
		System.out.println(sb);
	}
}