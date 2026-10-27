import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
                
        if(s.charAt(0) == ')') answer = false;
        if(s.charAt(s.length() - 1) == '(') answer = false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i ++) {
            stack.push(s.charAt(i));
        }
        
        int tmp = 0;
        for(int i = 0; i < s.length(); i ++) {
            Character c = stack.pop();
            if(c == ')') 
                tmp++;
            else
                if(tmp > 0)
                    tmp--;
                else 
                    answer = false;
        }
            

        return answer;
    }
}