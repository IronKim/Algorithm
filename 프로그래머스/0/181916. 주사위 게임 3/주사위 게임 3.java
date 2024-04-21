import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> answer = new HashMap<Integer, Integer>();
        int temp = answer.getOrDefault(a, 0);
        answer.put(a, ++temp);
        temp = answer.getOrDefault(b, 0);
        answer.put(b, ++temp);
        temp = answer.getOrDefault(c, 0);
        answer.put(c, ++temp);
        temp = answer.getOrDefault(d, 0);
        answer.put(d, ++temp);
        
        if(answer.size() == 1) {
        	return 1111 * a;
        }else if(answer.size() == 2) {
        	int maxC = answer.values().stream().mapToInt(i -> i).max().getAsInt();
        	if(maxC == 3) {
        		int p = answer.entrySet().stream().filter(i -> i.getValue() == 3).findFirst().get().getKey();
        		int q = answer.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
        		return (int)Math.pow(10 * p + q, 2);
        	}else {
        		int p = answer.keySet().stream().mapToInt(i -> i).max().getAsInt();
        		int q = answer.keySet().stream().mapToInt(i -> i).min().getAsInt();
        		return (p + q) * Math.abs(p - q);
        	}	
        }else if(answer.size() == 3) {
        	int max = answer.entrySet().stream().max((q,w) -> q.getValue() > w.getValue() ? 1 : -1).get().getKey();
        	answer.remove(max);
        	int q = answer.keySet().stream().mapToInt(i -> i).max().getAsInt();
        	int r = answer.keySet().stream().mapToInt(i -> i).min().getAsInt();
        	return q * r;
        }else {
			return answer.keySet().stream().mapToInt(i -> i).min().getAsInt();
		}
    }
}