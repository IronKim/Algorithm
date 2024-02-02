class Solution {
    public int solution(int[] numbers) {
        
        int numberOne = 0;
        int numberTwo = 0;
        
        for(int n : numbers) {
            if(n > numberOne) {
                numberTwo = numberOne > numberTwo ? numberOne : numberTwo;
                numberOne = n;
                continue;
            }
            if(n > numberTwo) {
                numberTwo = n;
            }
        }
        
        return numberOne * numberTwo;
    }
}