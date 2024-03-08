import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        String str = Arrays.stream(arr).mapToObj(String::valueOf).reduce((x, y) -> x + "," + y).get();
     
        int a = str.indexOf("2");
        
        if(a == -1) {
        	return new int[] {-1};
        }
        
        int b = str.lastIndexOf("2");
        
        str = str.substring(a, b + 1);
        
        return Stream.of(str.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}