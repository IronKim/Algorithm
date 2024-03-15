class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        for(int i = 0; i < 3; i++) {
        	int temp = (int) (10000 / Math.pow(100, i));
            int min = 101;
        	int idx = 0;
        	for(int j = 0; j < rank.length; j++) {
        		if(attendance[j] && min > rank[j]) {
        			min = rank[j];
        			idx = j;
        		}
        	}
            attendance[idx] = false;
        	answer += temp * idx;
        }
        
        return answer;
    }
}