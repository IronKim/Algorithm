class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String temp = my_string.toLowerCase().replaceAll("[a-z]", "a");
        
        String[] t = temp.split("a");
        
        for(int i = 0; i < t.length; i++) {
        	if(!t[i].equals(""))
        	answer += Integer.parseInt(t[i]);
        }
        
        return answer;
    }
}