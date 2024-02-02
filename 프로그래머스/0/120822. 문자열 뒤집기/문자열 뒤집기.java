class Solution {
    public String solution(String my_string) {
        char[] chars = new char[my_string.length()];
        for (int i = 0; i < chars.length; i++) {
			chars[i] = my_string.charAt(my_string.length() - i - 1);
		}
        
        return String.valueOf(chars);
    }
}