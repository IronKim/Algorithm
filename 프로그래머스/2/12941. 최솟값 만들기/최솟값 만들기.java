import java.util.*;
import java.util.stream.Collectors;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        List<Integer> listA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(B).boxed().collect(Collectors.toList());
        
        Collections.sort(listA);
        Collections.sort(listB, Collections.reverseOrder());
        
        
        for(int i = 0; i < listA.size(); i++) {
            answer += listA.get(i) * listB.get(i);
        }
                                                                                                  

        return answer;
    }
}