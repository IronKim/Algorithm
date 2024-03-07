import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        Arrays.sort(be);
        Arrays.sort(af);
        
        return Arrays.equals(be, af) ? 1 : 0;
    }
}