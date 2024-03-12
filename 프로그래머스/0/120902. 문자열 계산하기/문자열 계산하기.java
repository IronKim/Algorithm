class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] temp = my_string.split(" ");
        answer = Integer.valueOf(temp[0]);
        
        for(int i = 0; i < temp.length; i++) {
        	switch (temp[i]) {
                case "+":
                    answer += Integer.valueOf(temp[i + 1]);
                    break;

                case "-":
                    answer -= Integer.valueOf(temp[i + 1]);
                    break;
    		}
        }
          
        return answer;
    }
}