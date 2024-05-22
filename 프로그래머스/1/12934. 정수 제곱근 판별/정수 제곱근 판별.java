class Solution {
    public long solution(long n) {
        return (long) (Math.sqrt(n) == (int)Math.sqrt(n) ? Math.pow(Math.sqrt(n) + 1 , 2) : -1);
    }
}