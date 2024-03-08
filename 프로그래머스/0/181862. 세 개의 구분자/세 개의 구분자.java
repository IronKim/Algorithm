class Solution {
    public String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        
        
        
        return myStr.trim().split("\\s+")[0].equals("") ? answer : myStr.trim().split("\\s+");
    }
}