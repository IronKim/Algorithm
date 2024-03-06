import java.time.LocalDateTime;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDateTime localDateTime1 = LocalDateTime.of(date1[0], date1[1], date1[2], 0, 0);
        LocalDateTime localDateTime2 = LocalDateTime.of(date2[0], date2[1], date2[2], 0, 0);
        
        return localDateTime1.isBefore(localDateTime2) ? 1 : 0;
    }
}