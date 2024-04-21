import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for(int[] i : lines) {
			for(int j : IntStream.range(Math.min(i[0], i[1]), Math.max(i[0], i[1])).toArray()) {
				temp.put(j, temp.getOrDefault(j, 0) + 1);
			}
		}
		
        return (int)temp.values().stream().filter(i -> i >=2).count();
    }
}