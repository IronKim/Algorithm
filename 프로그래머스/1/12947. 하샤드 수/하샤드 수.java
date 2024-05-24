class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int sum = 0;
        for (char c : str.toCharArray()) {
			sum += Character.getNumericValue(c);
		}
       
        return Integer.valueOf(str) % sum == 0 ? true : false;
    }
}