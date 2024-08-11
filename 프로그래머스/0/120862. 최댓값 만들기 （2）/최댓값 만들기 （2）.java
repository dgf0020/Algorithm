import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int len = numbers.length;
        
        Arrays.sort(numbers);
        
        int a = numbers[0] * numbers[1];
        int b = numbers[len - 1] * numbers[len - 2];
        
        if (a > b) {
            answer = a;
        }
        else {
            answer = b;
        }
        
        return answer;
    }
}