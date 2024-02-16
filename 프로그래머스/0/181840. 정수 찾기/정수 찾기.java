import java.util.*;

class Solution {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).filter(i -> i == n).findFirst().isPresent() ? 1 : 0;
    }
}