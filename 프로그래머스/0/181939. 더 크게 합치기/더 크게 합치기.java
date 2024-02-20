class Solution {
    public int solution(int a, int b) {
        int sum1 = Integer.parseInt(a + "" + b);
        int sum2 = Integer.parseInt(b + "" + a);
        return sum1 >= sum2 ? sum1 : sum2;
    }
}