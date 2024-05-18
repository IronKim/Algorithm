import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder answer = new StringBuilder();
		StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++) {
			sb.append(br.readLine());
			String original = sb.toString();
			String reverse = sb.reverse().toString();
	
			if(original.equals(reverse)) {
				answer.append("#" + test_case + " " + 1 + "\n");
			} else {
				answer.append("#" + test_case + " " + 0 + "\n");
			}
			
			sb.setLength(0);
		}
        System.out.println(answer);
	}
}