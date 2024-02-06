import java.util.*;

class Solution {
    public int solution(int[] sides) {
        
        int[] tmp = Arrays.stream(sides).sorted().toArray();
        
        return tmp[0] + tmp[1] > tmp[2] ? 1 : 2;
    }
}