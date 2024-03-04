class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = String.valueOf(num);
        
        for(int i = 0; i < numStr.length(); i++) {
        	if(Character.getNumericValue(numStr.charAt(i)) == k) {
        		answer = i + 1;
                break;
        	}
        }
        
        
        return answer;
    }
}