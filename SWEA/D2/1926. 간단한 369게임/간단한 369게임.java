import java.io.*;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.valueOf(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			boolean tmp = false;
			
			for(char c : String.valueOf(i).toCharArray()) {
				if(c == '3' || c == '6' || c == '9') {
					sb.append("-");
					tmp = true;
				}
			}
			
			sb.append(tmp ? " " : i + " ");
		}
		
		System.out.print(sb);
	}
}