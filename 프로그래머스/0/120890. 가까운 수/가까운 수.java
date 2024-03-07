class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
        	if(min == Math.abs(n - array[i])){
                answer = answer > array[i] ? array[i] : answer;
                continue;
            }
        	if(min > Math.abs(n - array[i])) {
        		min = Math.abs(n - array[i]);
                answer = array[i];
        	}
            
        }
        
        return answer;
    }
}