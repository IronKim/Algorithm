class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int value = 0;        
        String binary = s;                
        
        while(!binary.equals("1")) {
            int tmp = 0;
            
            for(int i = 0; i < binary.length(); i++) {
                char c = binary.charAt(i);
                
                if(c == '0') {
                    value++;          
                } else {
                    tmp++;  
                }               
                
            }
            
            binary = Integer.toBinaryString(tmp);
                        
            cnt++;    
        }
                
        answer[0] = cnt;
        answer[1] = value;        
        
        return answer;
    }
}