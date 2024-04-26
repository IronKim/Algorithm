import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        Stack<State> stack = new Stack<State>();
        stack.push(new State(0, 0));
        
        int answer = 0;
        
        while(!stack.isEmpty()) {
            State state = stack.pop();
            
            if(state.idx == numbers.length) {
                if(state.acc == target) answer++;
                continue;
            }
            
            stack.push(new State(state.idx + 1, state.acc - numbers[state.idx]));
            stack.push(new State(state.idx + 1, state.acc + numbers[state.idx]));
        }
        
        return answer;
    }
    class State {
        int idx;
        int acc;
        
        State(int idx, int acc) {
            this.idx = idx;
            this.acc = acc;
        }
    }
}