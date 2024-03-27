import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < array.length; i++) {
        	if(!temp.containsKey(array[i])) {
        		temp.put(array[i], 1);
        	}else {
        		temp.put(array[i], temp.get(array[i]) + 1);
        	}
        }
        
        List<Integer> t = new ArrayList<Integer>();
        
        for(int i : temp.keySet()) {
        	if(t.isEmpty()) t.add(i);
        	else if(temp.get(t.get(0)) <= temp.get(i)) t.add(0, i);
        	else t.add(i);
        }
        
        if(t.size() == 1) return t.get(0);
        
        return temp.get(t.get(0)) == temp.get(t.get(1)) ? -1 : t.get(0);
    }
}