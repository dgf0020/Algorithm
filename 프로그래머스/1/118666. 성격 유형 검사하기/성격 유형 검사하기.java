import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
		
		String[] type = {"R","T","C","F","J","M","A","N"};
		int[] score = {0,3,2,1,0,1,2,3};
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < type.length; i++) {
			map.put(type[i], 0);
		}
		
		for (int i = 0; i < choices.length; i++) {
			String a = survey[i].substring(0,1);
			String b = survey[i].substring(1);
			
			if (choices[i] < 4) {
				map.put(a, map.get(a) + score[choices[i]]);
			}
			else {
				map.put(b, map.get(b) + score[choices[i]]);
			}
		}
		
		for (int i = 0; i < type.length; i+=2) {
			String ans = type[i];
			if (map.get(type[i]) < map.get(type[i + 1])) {
				ans = type[i + 1];
			}
			answer += ans;
		}
        
        return answer;
    }
}