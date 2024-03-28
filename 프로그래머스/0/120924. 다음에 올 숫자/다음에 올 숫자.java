class Solution {
    public int solution(int[] common) {
        int mode = common[common.length - 1] - common[common.length - 2] == common[common.length - 2] - common[common.length - 3] ? 0 : 1;
        int answer = 0;
        
        if(mode == 1) {
        	for(int i = -1000; i < 2000; i++) {
        		if(common[0] * i == common[1]) {
        			answer = i;
        			break;
        		}
        	}
        }else {
        	answer = common[common.length - 1] - common[common.length - 2];
        }
        
        return mode == 0 ? common[common.length - 1] + answer : common[common.length - 1] * answer;
    }
}