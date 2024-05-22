import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
    
        return Long.valueOf(new StringBuilder(String.valueOf(arr)).reverse().toString());
    }
}