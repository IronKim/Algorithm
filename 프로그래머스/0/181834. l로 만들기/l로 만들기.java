class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        
        for(char c : myString.toCharArray()) {
            sb.append(c > 'l' ? c : 'l');
        } 
        
        return sb.toString();
    }
}