class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(char c : String.valueOf(order).toCharArray()) {
            if(Character.getNumericValue(c) != 0 && Character.getNumericValue(c) % 3 == 0) {
            	answer++;
            }
        }
        
        return answer;
    }
}