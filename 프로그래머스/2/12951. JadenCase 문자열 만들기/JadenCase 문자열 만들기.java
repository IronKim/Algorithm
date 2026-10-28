class Solution {
    public String solution(String s) {
        String answer = "";
        boolean bool = true;
        
        for(int i = 0; i < s.length(); i++) {            
            if(i == 0) {
                answer += Character.toString(s.charAt(i)).toUpperCase();
            }else if(Character.isWhitespace(s.charAt(i - 1))) {
                answer += Character.toString(s.charAt(i)).toUpperCase();
            } else {
                answer += Character.toString(s.charAt(i)).toLowerCase();
            }
        }
        
        
        return answer;
    }
}