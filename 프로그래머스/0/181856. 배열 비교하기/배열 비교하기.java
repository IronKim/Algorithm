import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length) {
            return 1;
        }else if(arr1.length < arr2.length) {
            return -1;
        }else {
            int a = Arrays.stream(arr1).sum();
            int b = Arrays.stream(arr2).sum();
            return a > b ? 1 : a < b ? -1 : 0;
        }
    }
}