import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {

        List<String> answer = new ArrayList<String>(Arrays.asList(strArr));
		
		answer.removeIf(str -> str.contains("ad"));
		
        return answer.toArray(new String[answer.size()]);
    }
}