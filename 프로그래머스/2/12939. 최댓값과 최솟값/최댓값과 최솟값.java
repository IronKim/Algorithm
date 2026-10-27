import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sTmp = s.split(" ");        
        
        long minV = Long.parseLong(sTmp[0]);
        long maxV = Long.parseLong(sTmp[0]);
        
        for(int i = 0; i < sTmp.length; i++) {
            if(minV >= Long.parseLong(sTmp[i])) {
                minV = Long.parseLong(sTmp[i]);
            }
             
            if(maxV <= Long.parseLong(sTmp[i])) {
                maxV = Long.parseLong(sTmp[i]);
            }
        }
        
        answer = minV + " " + maxV;
        
        return answer;
    }
}