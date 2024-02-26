class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for(String str : str_list) {
            sb.append(str.contains(ex) ? "" : str);
        }
        
        return sb.toString();
    }
}