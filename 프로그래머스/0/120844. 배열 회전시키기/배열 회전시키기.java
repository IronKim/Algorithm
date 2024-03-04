class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp;
        if(direction.equals("right")) {
        	for(int i = numbers.length - 1; i > -1; i--) {
        		if(i - 1 == -1) {
        			answer[i] = numbers[numbers.length - 1];
        			continue;
        		}
        		answer[i] = numbers[i - 1];  
        	}
        	
        }else {
        	for(int i = 0; i < numbers.length; i++) {
        		answer[i] = numbers[(i + 1) % numbers.length];
        	}
        }
        
        return answer;
    }
}