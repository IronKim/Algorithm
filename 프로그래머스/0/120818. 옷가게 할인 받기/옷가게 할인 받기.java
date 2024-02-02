class Solution {
    public int solution(int price) {
        int answer = 0;
        double discount = 0;
        
        if(price >= 500000) {
            discount = 0.8;
        }else if(price >= 300000) {
            discount = 0.9;
        }else if(price >= 100000) {
            discount = 0.95;
        }
        
        if(discount != 0) {
            answer = (int)(price * discount);
        }else {
            answer = price;
        }
        
        return answer;
    }
}