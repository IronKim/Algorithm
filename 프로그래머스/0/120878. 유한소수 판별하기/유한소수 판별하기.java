import java.util.*;
import java.util.*;

class Solution {
    public int solution(int a, int b) {
        if(a % b == 0) return 1;
        int maxDiv = 1;
        
        for(int i = 1; i <= Math.min(a, b); i++) {
        	if(a % i == 0 && b % i == 0) {
        		maxDiv = i;        		
        	}
        }
        
        int temp = b / maxDiv ;
        Set<Integer> set = new HashSet<Integer>();
        set.add(2);
        set.add(5);
        
        for(int i = 2; temp != 1 ; i++) {
        	if(temp % i == 0) {
        		temp /= i;
        		set.add(i);
        		i = 1;
        	}
        }
        
        return set.equals(Set.of(2, 5)) ? 1 : 2;
    }
}