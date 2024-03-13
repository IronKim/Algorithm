import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        if(arr.length > arr[0].length) {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Arrays.copyOf(arr[i], arr.length);
			}
			return arr;
		}else {
			int[][] temp = new int[arr[0].length][arr[0].length];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					temp[i][j] = arr[i][j];
				}
			}
			
			return temp;
		}
    }
}