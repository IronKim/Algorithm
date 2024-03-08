import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = s;
        
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
        	for(int j = i + 1; j < chars.length; j++) {
        		if(chars[i] == chars[j]) {
        			answer = answer.replace(String.valueOf(chars[i]), "");
        		}
        	}
        }
        char[] temp = answer.toCharArray();
        
        Arrays.sort(temp);
        
        return String.valueOf(temp);
    }
}