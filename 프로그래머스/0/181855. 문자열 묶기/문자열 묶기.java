import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for(int i = 0; i < strArr.length; i++) {
        	if(!temp.containsKey(strArr[i].length())) {
        		temp.put(strArr[i].length(), 1);
        	}else {
        		temp.put(strArr[i].length(), temp.get(strArr[i].length()) + 1);
        	}
        }
        
        return temp.values().stream().mapToInt(i -> i).max().getAsInt();
    }
}