class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp.charAt(0), Character.toUpperCase(alp.charAt(0)));
    }
}