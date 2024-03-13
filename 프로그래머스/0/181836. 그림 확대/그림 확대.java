class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
    
        for(int i = 0; i < picture.length; i++) {
            String temp = "";
        	for(String s : picture[i].split("")) {
        		temp += s.repeat(k);
        	}
            
            int t = i * k;
            
            for(int j = t; j < t + k ; j++) {
                answer[j] = temp;
            }
            
        }
        
        return answer;
    }
}