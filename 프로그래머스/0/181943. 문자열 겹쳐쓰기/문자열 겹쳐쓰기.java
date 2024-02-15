class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        return my_string.subSequence(0, s).toString() + 
            overwrite_string + my_string.substring(overwrite_string.length() + s);
    }
}