class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(s <= i && i <= e) {
        		answer += sb.charAt(i - s);
        	}else {
                answer += my_string.charAt(i);
            }
        	
        	
        }
        
        return answer;
    }
}