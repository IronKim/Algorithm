import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return IntStream.concat(Arrays.stream(Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1)),
        		Arrays.stream(Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1))).toArray();
    }
}