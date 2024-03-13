import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int[] temp = new int[spell.length];
        
        for(int i = 0; i < dic.length; i++) {
        	for(int j = 0; j < spell.length; j++) {
        		if(dic[i].contains(spell[j])) {
        			temp[j] = 1;
        		}else {
        			temp[j] = 0;
				}
        	}
        	
        	if(Arrays.stream(temp).allMatch(b -> b == 1)) {
        		return 1;
        	}
        }
        
        return 2;
    }
}