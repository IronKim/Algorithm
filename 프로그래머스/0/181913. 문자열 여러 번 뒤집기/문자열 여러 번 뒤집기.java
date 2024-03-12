class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder msb = new StringBuilder(my_string);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < queries.length; i++) {
        	sb.append(msb.substring(queries[i][0], queries[i][1] + 1));
        	sb.reverse();
        	msb.delete(queries[i][0], queries[i][1] + 1);
        	msb.insert(queries[i][0], sb);
        	sb.delete(0, sb.length());
        }
        
        
        return msb.toString();
    }
}