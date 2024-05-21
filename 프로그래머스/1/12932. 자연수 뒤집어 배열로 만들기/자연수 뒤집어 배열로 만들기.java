class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
		
        int[] answer = new int[str.length()];
        
        for(int i = answer.length - 1; i >= 0; i--) {
        	answer[i] = Character.getNumericValue(ch[answer.length - 1 - i]);
        }
        
        return answer;
    }
}