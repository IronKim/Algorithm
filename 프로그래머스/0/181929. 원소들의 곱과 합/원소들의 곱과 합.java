class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gop = 1, hap = 0;
        
        for(int n : num_list) {
            gop *= n;
            hap += n;
        }
        
        
        return gop > hap * hap ? 0 : 1;
    }
}