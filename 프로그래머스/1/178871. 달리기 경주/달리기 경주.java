import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		for (int j = 0; j < callings.length; j++) {
			int a = map.get(callings[j]);
			
			map.put(callings[j], a - 1);
			map.put(players[a - 1], a);
			
			String player = players[a - 1];
			players[a - 1] = players[a];
			players[a] = player;
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = players[i];
		}
       
        return answer;
    }
}