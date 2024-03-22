class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
		
		for(int i = 0; i < A.length(); i++) {
			if(sb.toString().equals(B)) return i;
			char temp = sb.charAt(sb.length() - 1);
			for(int j = sb.length() - 1; j > 0; j--) {
				sb.setCharAt(j, sb.charAt(j - 1));
			}
			sb.setCharAt(0, temp);
		}
 
        return -1;
    }
}