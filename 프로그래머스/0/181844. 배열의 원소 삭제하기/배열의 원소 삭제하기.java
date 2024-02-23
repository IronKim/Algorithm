import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> delList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
		arrList.removeAll(delList);
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}