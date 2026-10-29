class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int tmp = 0;
        
        int i = 1;
        int cnt = 1;
                
        while(i < n) {
                        
            tmp += i;
            
            if(tmp == n) {
                tmp = 0;
                answer++;
                cnt++;
                i = cnt;                
            } else if(tmp > n) {
                tmp = 0;
                cnt++;
                i = cnt;
            }
            
            i++;
        }
                
        return answer;
    }
}