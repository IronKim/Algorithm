import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        return Stream.of(myString.split("x", -1)).map(str -> str.length()).mapToInt(Integer::intValue).toArray();
    }
}