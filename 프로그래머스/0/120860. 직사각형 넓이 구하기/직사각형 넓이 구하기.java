class Solution {
    public int solution(int[][] dots) {
        int minX = 256, maxX = -256, minY = 256, maxY = -256;
        int w = 0, h = 0;
        
        for(int i = 0; i < dots.length; i++) {
        	minX = Math.min(minX, dots[i][0]);
        	maxX = Math.max(maxX, dots[i][0]);
        	minY = Math.min(minY, dots[i][1]);
        	maxY = Math.max(maxY, dots[i][1]);
        }
        
        for(int i = minX; i < maxX; i++) {
        	w++;
        }
        for(int i = minY; i < maxY; i++) {
        	h++;
        }
        
        
        return w * h;
    }
}