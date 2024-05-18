import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder answer = new StringBuilder();
		List<Integer> list = new ArrayList<Integer>();

		for(int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 10; i++) {
				list.add(Integer.valueOf(st.nextToken()));
			}
			
			list.remove(Collections.max(list));
			list.remove(Collections.min(list));
			
			long sum = list.stream().mapToLong(i -> i).sum();
            double avg = sum / 8.0;
			
			answer.append("#" + test_case + " " + Math.round(avg) + "\n");
			
			list.clear();
		}
        System.out.println(answer);
	}
}