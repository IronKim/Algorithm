class Solution {
    public int solution(int[][] dots) {
        Dot[] temp = new Dot[4];
        for(int i = 0; i < dots.length; i++) {
        	temp[i] = (new Dot(dots[i][0], dots[i][1]));
        }
        
        if(Dot.getInclination(temp[0], temp[1]) == Dot.getInclination(temp[2], temp[3])) return 1;
        else if(Dot.getInclination(temp[0], temp[2]) == Dot.getInclination(temp[1], temp[3])) return 1;
        else if(Dot.getInclination(temp[0], temp[3]) == Dot.getInclination(temp[1], temp[2])) return 1; 
       
        return 0;
    }
}

class Dot {
	double x;
	double y;
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	static double getInclination(Dot a, Dot b) {
		return Math.abs(a.y - b.y) / Math.abs(a.x - b. x); 
	}
}