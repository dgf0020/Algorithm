class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max, min;
        
        if (sides[0] > sides[1]) {
            max = sides[0];
            min = sides[1];
        }
        else {
            max = sides[1];
            min = sides[0];
        }
        
        int l = max + min;
        int s = max - min;
        
        answer = l - s - 1;
        
        return answer;
    }
}