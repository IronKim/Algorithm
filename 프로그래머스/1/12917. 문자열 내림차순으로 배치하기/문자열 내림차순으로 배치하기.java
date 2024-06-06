import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        sb.append(chars);

        return sb.reverse().toString();
    }
}