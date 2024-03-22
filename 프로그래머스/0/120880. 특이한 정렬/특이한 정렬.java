class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i = 1; i < numlist.length; i++) {
			for(int j = 0; j < numlist.length - i; j++) {
				if(Math.abs(n - numlist[j]) > Math.abs(n - numlist[j + 1])) {
					int temp = numlist[j];
					numlist[j] = numlist[j + 1];
					numlist[j + 1] = temp;
				}else if (Math.abs(n - numlist[j]) == Math.abs(n - numlist[j + 1])) {
					if(numlist[j] < numlist[j + 1]) {
						int temp = numlist[j];
						numlist[j] = numlist[j + 1];
						numlist[j + 1] = temp;
					}
				}
			}
		}
		
        return numlist;
    }
}