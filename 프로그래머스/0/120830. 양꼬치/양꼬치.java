class Solution {
    public int solution(int n, int k) {
        int answer = (12000 * n) + (k * 2000);
        int temp = n / 10;
        temp *= 2000;
        
        return answer - temp;
    }
}