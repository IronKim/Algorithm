class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        int variable = 0;
        int constant = 0;
        
        for(int i = 0; i < polynomial.length(); i++) {
        	if(polynomial.charAt(i) == 'x') {
        		if(i == 0 ||(i != 0 && !Character.isDigit(polynomial.charAt(i - 1)))) {
        			temp.append(1);
        		}
        	}
        	temp.append(polynomial.charAt(i));
        }
        
        String[] tmp = temp.toString().split(" ");
        
        for(int i = 0; i < tmp.length; i++) {
        	if(tmp[i].equals("+")) continue;
        	else if(tmp[i].contains("x")) variable += Integer.parseInt(tmp[i].replace("x", ""));
        	else constant += Integer.parseInt(tmp[i]);
        }
        
        if(variable == 0) return constant + "";
        if(variable == 1 && constant != 0) return "x" + " + " + constant;
        if(variable == 1 && constant == 0) return "x";
        if(variable > 1 && constant == 0) return variable + "x";
        if(variable > 1 && constant != 0) return variable + "x" + " + " + constant;
        
        return answer;
    }
}