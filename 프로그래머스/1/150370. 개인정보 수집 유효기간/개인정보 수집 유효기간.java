import java.util.*;
import java.text.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        List<Integer> answer = new ArrayList<Integer>();
        
        Map<String, Integer> tmpMap = Arrays.stream(terms)
            .map(s -> s.split(" "))
            .collect(Collectors.toMap(a -> a[0], a -> Integer.parseInt(a[1])));
        
        for(int i = 0; i < privacies.length; i++) {
            String kind = privacies[i].split(" ")[1];
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            Date date = format.parse(privacies[i].split(" ")[0]);
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            
            cal.add(Calendar.MONTH, tmpMap.get(kind));
            String reDate = format.format(cal.getTime());
            
            if(reDate.compareTo(today) <= 0) {
            	answer.add(i + 1);
            }
            
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}