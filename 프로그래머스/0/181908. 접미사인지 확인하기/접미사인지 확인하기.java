import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] suffix = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            suffix[i] = my_string.substring(i, my_string.length()); 
        }
        
        return Arrays.asList(suffix).contains(is_suffix) ? 1 : 0;
    }
}