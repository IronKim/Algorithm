class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int mother = denom1 * denom2;
        int son1 = numer1 * denom2;
        int son2 = numer2 * denom1;
        int totalSon = son1 + son2;
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        int[] answer = {totalSon, mother};
        return answer;
    }
}