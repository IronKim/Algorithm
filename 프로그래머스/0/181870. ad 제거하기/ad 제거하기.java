import java.util.*;

class Solution {
    public Object[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(str -> !str.contains("ad")).toArray();
    }
}