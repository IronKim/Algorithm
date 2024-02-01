import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] strlist) {
        
        List<Integer> list = new ArrayList<>();
        
        for(String str : strlist) {
            list.add(str.length());
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}