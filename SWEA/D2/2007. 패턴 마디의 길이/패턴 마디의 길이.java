import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			String temp = br.readLine();
			
			for(int i = 2; i < 10; i++) {
				String t1 = temp.substring(0, i);
				String t2 = temp.substring(i, i + i);
			
				if(t1.equals(t2)) {
					sb.append("#" + test_case + " " + i + "\n");
					break;
				}
			}
		}
        System.out.println(sb);
	}
}